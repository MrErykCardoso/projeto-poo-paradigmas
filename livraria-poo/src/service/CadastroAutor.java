package service;
import java.util.Scanner;

public class CadastroAutor {
    static Scanner s = new Scanner(System.in);

    public static Autor cadastro() {
        String nome = null, nomeArt = null, email = null, cpf = null;
        Autor autor = new Autor();

        while(nome == null || nome.isEmpty()){
            System.out.println("\n\nInsira o nome do autor: ");
            nome = s.nextLine();
            if (nome != null && !nome.isEmpty()){
                autor.setNome(nome);
            }else{
                System.out.println("\n\nO valor inserido não é válido!\n Por favor, tente novamente e insira um valor válido.");
            }
        }

        while (nomeArt == null || nomeArt.isEmpty()){
            System.out.println("\n\nInsisra o nome artístico: ");
            nomeArt = s.nextLine();

            if (nomeArt != null && !nomeArt.isEmpty()){
                autor.setNomeArtistico(nomeArt);
            }else{
                System.out.println("\n\nO valor inserido não é válido!\n Por favor, tente novamente e insira um valor válido.");
            }
        }
        
        while(email == null || email.isEmpty()){
            System.out.println("\n\nInsira o email: ");
            email = s.nextLine();

            if(email != null && !email.isEmpty()){
                autor.setEmail(email);
            }else{
                System.out.println("\n\nO valor inserido não é válido!\n Por favor, tente novamente e insira um valor válido.");
            }
        }
        
        while(cpf == null || cpf.isEmpty()){
            System.out.println("\n\nInsira o CPF: ");
            
            if(cpf != null && !cpf.isEmpty()){
                autor.setCpf(cpf);
            }else{
                System.out.println("\n\nO valor inserido não é válido!\n Por favor, tente novamente e insira um valor válido.");
            }
        }
        
        return autor;
    }
}
