import java.util.Scanner;

public class CadastroLivro {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        Autor jonasSilverHeat = new Autor();

        jonasSilverHeat.nome = "Jonas Pacheco";
        jonasSilverHeat.nomeArtistico = "Jonas Silver Heart";
        jonasSilverHeat.email = "encantadorDeGatinhas@email.com";
        jonasSilverHeat.cpf = "000.000.000-00";

        Livro livro = new Livro(1.0);

        System.out.println("Insira o nome do Livro: ");
        livro.setNome(s.nextLine());
        
        System.out.println("Insira o valor do livro: ");
        livro.setValor(s.nextDouble());
        s.nextLine();

        System.out.println("Insira a descrição do Livro: ");
        livro.setDescricao(s.nextLine());
        
        System.out.println("Insira o código ISBN do livro: ");
        livro.setIsbn(s.nextLine());
        
        livro.autor = jonasSilverHeat;

        livro.aplicarDesconto(50);
        livro.imprimeAtributo();
        livro.autor.imprimeAutor();
    }
}
