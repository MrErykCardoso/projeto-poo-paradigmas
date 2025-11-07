package model;

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
        return this.nome = nome;
    }
    public double setPreco(double preco){
        return this.preco = preco;
    }
    public Produto(){}

    public void mostrarInf(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
