import java.util.Scanner;


public class Produto {
    Scanner s = new Scanner(System.in);
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            return this.nome = nome;
        }else{
            System.out.println("O campo de nome do produto não pode estar vazio!\nInsira o nome do produto novamente.");
        }
    }

    public double setPreco(double preco){
        while(preco < 0){
            System.out.println("Insira o preço do produto: ");
            preco = s.nextDouble();
            if(preco >= 0){
                return this.preco = preco;
            }else{
                System.out.println("O campo de preço do produto não pode se igual ou menor do que 0!\\nInsira um preço válido.");
            }
        }
    }

    public Produto(){}

    public void mostrarInf(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
