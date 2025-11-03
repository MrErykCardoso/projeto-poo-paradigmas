public class Livro {
    String nome;
    double valor;
    double valorComDesconto;
    String descricao;
    String isbn;
    Autor autor;

    void imprimeAtributo(){
        System.out.println("\n\nInformações do livro: -------------------");
        System.out.println("\nNome: " + nome);
        System.out.println("\nValor: " + valor + " R$");
        System.out.println("\nValor com Desconto: " + valorComDesconto);
        System.out.println("\nDescrição: " + descricao);
        System.out.println("\nISBN: " + isbn);
        System.out.println("\nAutor: " + autor.nomeArtistico);
        System.out.println("\n----------------------------------------");
    }

    void aplicarDesconto(double porcentagem){
        valorComDesconto = valor - (valor*(porcentagem/100));
        System.out.println("\n\nDesconto Aplicado!---------------");
        System.out.println("\nNovo valor: " + valorComDesconto);
        System.out.println("\n---------------------------------");
    }
}
