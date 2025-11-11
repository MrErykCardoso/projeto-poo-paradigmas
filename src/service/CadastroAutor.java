package service;

import model.Autor;
import exceptions.*;

import java.util.Scanner;

public class CadastroAutor {
    static Scanner s = new Scanner(System.in);

    public static Autor cadastro() throws Exception {
        String nome = null, nomeArt = null, email = null, cpf = null;
        Autor autor = new Autor();

        while(nome == null || nome.isBlank()){
            System.out.println("\n\nInsira o nome do autor: ");
            nome = s.nextLine();
            if (nome != null && !nome.isBlank()){
                autor.setNome(nome);
            }else{
                throw new InvalidValue("O campo de nome não pode ser vazio e nem nulo.");
            }
        }

        while (nomeArt == null || nomeArt.isBlank()){
            System.out.println("\n\nInsisra o nome artístico: ");
            nomeArt = s.nextLine();

            if (nomeArt != null && !nomeArt.isBlank()){
                autor.setNomeArtistico(nomeArt);
            }else{
                throw new InvalidValue("O campo de nome artístico não pode ser vazio nem nulo.");
            }
        }
        
        while(email == null || email.isBlank()){
            System.out.println("\n\nInsira o email: ");
            email = s.nextLine();

            if(email != null && !email.isBlank()){
                autor.setEmail(email);
            }else{
                throw new InvalidValue("O campo de Email não pode ser vazio nem nulo.");
            }
        }
        
        while(cpf == null || cpf.isBlank()){
            System.out.println("\n\nInsira o CPF: ");
            
            if(cpf != null && !cpf.isBlank()){
                autor.setCpf(cpf);
            }else{
                throw new InvalidValue("O campo de CPF não pode ser vazio e nem nulo.");
            }
        }
        
        return autor;
    }
}
