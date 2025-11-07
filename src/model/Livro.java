package model;

public class Livro {
    private String nome;
    private double valor;
    public double valorComDesconto;
    private String descricao;
    private String isbn;
    public Autor autor;

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public double getValorComDesconto() {
        return valorComDesconto;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(){
        System.out.println("Livro Criado <3");
    }

    void imprimeAtributo(){
        System.out.println("\n\nInformações do livro: -------------------");
        System.out.println("\nNome: " + nome);
        System.out.println("\nValor: " + valor + " R$");
        System.out.println("\nValor com Desconto: " + valorComDesconto);
        System.out.println("\nDescrição: " + descricao);
        System.out.println("\nISBN: " + isbn);
        System.out.println("\nAutor: " + autor.getNomeArtistico());
        System.out.println("\n----------------------------------------");
    }

    void aplicarDesconto(double porcentagem){
        valorComDesconto = valor - (valor*(porcentagem/100));
        System.out.println("\n\nDesconto Aplicado!---------------");
        System.out.println("\nNovo valor: " + valorComDesconto);
        System.out.println("\n---------------------------------");
    }   
}
