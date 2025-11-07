package service;

import model.Livro;
import java.util.Scanner;

public class CadastroLivro {
    Scanner s = new Scanner(System.in);

    public void cadastro() {
        Livro livro = new Livro();

        System.out.println("Insira o nome do Livro: ");
        livro.setNome(s.nextLine());
        
        System.out.println("Insira o valor do livro: ");
        livro.setValor(s.nextDouble());
        s.nextLine();

        System.out.println("Insira a descrição do Livro: ");
        livro.setDescricao(s.nextLine());
        
        System.out.println("Insira o código ISBN do livro: ");
        livro.setIsbn(s.nextLine());
    }
    
    
}
