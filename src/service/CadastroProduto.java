package service;
import java.util.Scanner;

public class CadastroProduto {
    Scanner s = new Scanner(System.in);
    
    public void cadastro() {
        Produto produto = new Produto();

        System.out.println("Insira o nome do produto: ");
        produto.setNome(s.nextLine());

        System.out.println("Insira o preço do produto: ");
        produto.setPreco(s.nextDouble());
    }

}
