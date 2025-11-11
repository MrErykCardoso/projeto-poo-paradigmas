package service;

import model.Livro;
import java.util.Scanner;
import exceptions.InvalidValue;

public class CadastroLivro {
    Scanner s = new Scanner(System.in);
    String nome = null, descricao = null, isbn = null, valor = null;
    double v;

    public void cadastro() throws InvalidValue{
        Livro livro = new Livro();

        while(nome == null || nome.isBlank()){
            System.out.println("Insira o nome do Livro: ");
            nome = s.nextLine();

            if(nome != null && !nome.isBlank()){
                livro.setNome(nome);
                break;
            }else{
                throw new InvalidValue("O nome do livro não pode estar vazio nem nulo.");
            }
        }

        while(valor == null || valor.isBlank()){
            try {
                System.out.println("Insira o valor do livro: ");
                valor = s.nextLine();

                if(valor != null || !valor.isBlank()){
                    v = Double.parseDouble(valor);
                    livro.setValor(v);
                    s.nextLine();
                    break;
                }else{
                    throw new InvalidValue("O valor do livro não pode ser vazio nem nulo.");
                }
            } catch (NumberFormatException e) {
                throw new InvalidValue("O valor inserio não é compatível com um preço de livro.");
            }
        }

        while(descricao == null || descricao.isBlank()){
            System.out.println("Insira a descrição do Livro: ");
            descricao = s.nextLine();

            if(descricao != null && !descricao.isBlank()){
                livro.setDescricao(descricao);
                break;
            }else{
                throw new InvalidValue("A descrição do livro não pode estar vazia e nem ser nula.");
            }
        }

        while(isbn == null || isbn.isBlank()){
            System.out.println("Insira o código ISBN do livro: ");
            isbn = s.nextLine();

            if(isbn != null && !isbn.isBlank()){
                livro.setIsbn(isbn);
                break;
            }else{
                throw new InvalidValue("O ISBN não pode estar vazio e nem ser nulo.");
            }
        }
    }
    
    
}
