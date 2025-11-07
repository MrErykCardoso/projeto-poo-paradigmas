package model;

public class Autor {
    private String nome;
    private String nomeArtistico;
    private String email;
    private String cpf;

    public String getNome(){
        return nome;
    }
    public String getNomeArtistico(){
        return nomeArtistico;
    }
    public String getEmail(){
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String setNome(String nome) {
        return this.nome = nome;
    }
    public String setNomeArtistico(String nomeArtistico) {
        return this.nomeArtistico = nomeArtistico;
    }
    public String setEmail(String email) {
        return this.email = email;
    }
    public String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    void imprimeAutor(){
        System.out.println("\n\n Dados do autor: ---------------");
        System.out.println("\nNome: " + nome);
        System.out.println("\nNome Artístico: " + nomeArtistico);
        System.out.println("\nEmail: " + email);
        System.out.println("\nCPF: " + cpf);
        System.out.println("\n-----------------------------------");
    }
}
