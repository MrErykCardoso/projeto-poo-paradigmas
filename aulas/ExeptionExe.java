import java.util.Scanner;

public class ExeptionExe {
    public static void main (String [] args){

    }
}

class howOldVerify {
    Scanner s = new Scanner(System.in);
    int idade = 0;

    public void howOld() throws Exception{
        try{
            System.out.println("\n\nInsira usua idade: ");
            idade = s.nextInt();

            if(idade <= 0 && idade >= 120){
                throw new IllegalArgumentException();
            }

            System.out.println("\n\nSua idade é: " + idade + "anos;");
            
        }catch(ArithmeticException | IllegalArgumentException e){
            System.err.println("Erro: Inserção inválida. Insira um número inteiro entre 1 e 119;\n Mensagem: " + e);
        }finally{
            s.close();
        }
        
    }

}