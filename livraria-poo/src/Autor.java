public class Autor {
    String nome;
    String nomeArtistico;
    String email;
    String cpf;

    void imprimeAutor(){
        System.out.println("\n\n Dados do autor: ---------------");
        System.out.println("\nNome: " + nome);
        System.out.println("\nNome Artístico: " + nomeArtistico);
        System.out.println("\nEmail: " + email);
        System.out.println("\nCPF: " + cpf);
        System.out.println("\n-----------------------------------");
    }
}
