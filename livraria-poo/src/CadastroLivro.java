import java.util.Scanner;
import javax.swing.JOptionPane;

public class CadastroLivro {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        Autor jonasSilverHeat = new Autor();

        jonasSilverHeat.nome = "Jonas Pacheco";
        jonasSilverHeat.nomeArtistico = "Jonas Silver Heart";
        jonasSilverHeat.email = "encantadorDeGatinhas@email.com";
        jonasSilverHeat.cpf = "000.000.000-00";

        Livro livro = new Livro();

        System.out.println("Insira o nome do Livro: ");
        String nome = s.nextLine();
        System.out.println("Insira o valor do livro: ");
        double valor = s.nextDouble();
        s.nextLine();
        System.out.println("Insira a descrição do Livro: ");
        String descricao = s.nextLine();
        livro.isbn = "000-000-000";
        livro.autor = jonasSilverHeat;

        livro.aplicarDesconto(50);
        livro.imprimeAtributo();
        livro.autor.imprimeAutor();
    }
}
