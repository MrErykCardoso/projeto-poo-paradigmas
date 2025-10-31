public class CadastroLivro {
    public static void main (String[] args) {
        Autor jonasSilverHeat = new Autor();

        jonasSilverHeat.nome = "Jonas Pacheco";
        jonasSilverHeat.nomeArtistico = "Jonas Silver Heart";
        jonasSilverHeat.email = "encantadorDeGatinhas@email.com";
        jonasSilverHeat.cpf = "000.000.000-00";

        Livro livro = new Livro();

        livro.nome = "Love";
        livro.valor = 15;
        livro.descricao = "Uma história de amor.";
        livro.isbn = "000-000-000";
        livro.autor = jonasSilverHeat;

        livro.aplicarDesconto(50);
        livro.imprimeAtributo();
    }
}
