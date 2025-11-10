    
class Veiculo{
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void mostraInf() {
        System.out.println("-----VEICULO-----");
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private String modelo; //especifico

    public Carro(String marca, int ano, String modelo){
        super(marca, ano); //herdado
        this.modelo = modelo;
    }

    @Override
    public void mostraInf(){
        System.out.println("-----CARRO-----");
        super.mostraInf();
        System.out.println("Modelo: "+ modelo);
    }

}

public class TestaVeiculo {
    public static void main(String [] args){
    Carro carro = new Carro("FIAT", 2013, "Mille");

    carro.mostraInf();
}
}

