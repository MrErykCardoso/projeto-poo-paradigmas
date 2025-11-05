

public class CadastroProduto {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Insira o nome do produto: ");
        produto.setNome(s.nextLine());

        
        
        produto.mostrarInf();
    }
}
