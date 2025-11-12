package model;

public class Ebook extends Livro{
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
        this.nome = nome;//???????
    }
    public void setValor(double valor) {
        this.valor = valor;//???????
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;//???????
    }
    public void setIsbn(String isbn) {
        this.setIsbn(isbn) = isbn;//???????
    }

    public Ebook(){
        System.out.println("Ebook Criado <3");
    }

    @Override
    void aplicarDesconto(double porcentagem){
        double desconto = porcentagem/100;
        double valor = Ebook.getValor();//???????

        if(desconto >= 0.4){
            this.valorComDesconto = getvalor()*desconto;
        }else{
            System.out.println("O desconto não pode ser maior que 40% para Ebook.");
            return;
        }
    }
}

