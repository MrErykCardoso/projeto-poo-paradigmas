package model;

public class Ebook extends Livro{
    public Ebook() {
        super();
        System.out.println("Ebook Criado <3");
    }
    public Ebook(String nome, double valor, String descricao, String isbn) {
        super(nome, valor, descricao, isbn);
        this.valorComDesconto = valor;
        this.autor = null;
    }

    @Override
    public void aplicarDesconto(double porcentagem){
        double desconto = porcentagem/100;

        if(desconto <= 0.4){
            this.valorComDesconto = this.getValor() - (this.getValor()*desconto);
        }else{
            System.out.println("O desconto não pode ser maior que 40% para Ebook.");
            return;
        }
    }
}

