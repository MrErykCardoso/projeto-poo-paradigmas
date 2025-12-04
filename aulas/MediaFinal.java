import java.util.Scanner;

class Aluno{
    Scanner s = new Scanner(System.in);
    String nomeDoAluno;
    float notaDoExercicio;
    float notaDoTrabalho;
    float notaDaProva;
    float mediaFinal;

    public Aluno() {}

    public Aluno(String nomeDoAluno){
        this.nomeDoAluno = nomeDoAluno;
    }

    public Aluno(String nomeDoAluno, float notaDoExercicio, float notaDoTrabalho, float notaDaProva){
        this.nomeDoAluno = nomeDoAluno;
        this.notaDoExercicio = notaDoExercicio;
        this.notaDoTrabalho = notaDoTrabalho;
        this.notaDaProva = notaDaProva;
    }

    public void inserirNotas(){
        System.out.println("\n\nInsira a nota do exercício: ");
        this.notaDoExercicio = s.nextFloat();
        System.out.println("\n\nInsira a nota do trabalho: ");
        this.notaDoTrabalho = s.nextFloat();
        System.out.println("\n\nInsira a nota da prova: ");
        this.notaDaProva = s.nextFloat();
    }

    public void mediaFinal(){
        System.out.println("\n\n----- Calculo de média final: -----");
        float peso1 = 0, peso2 = 0, peso3 = 0;
        while(peso1 == 0 && peso2 == 0 && peso3 == 0){
            System.out.println("\nInforma a baixo os pesos para o calculo.\n(Os pesos devem ser um número entre 0 e 1. A soma dos pesos deve ser 1.)");
            System.out.println("Peso do exercício: ");
            peso1 = s.nextFloat();
            System.out.println("Peso do trabalho: ");
            peso2 = s.nextFloat();
            System.out.println("Peso da prova: ");
            peso3 = s.nextFloat();

            float pesoTotal = peso1 + peso2 + peso3;

            if(pesoTotal > 1 || pesoTotal < 0){
                System.out.println("Pesos inválidos. Por favor insira novos pesos seguindo as regras.");
                peso1 = 0;
                peso2 = 0;
                peso3 = 0;
            }
            else{
                this.mediaFinal = (this.notaDoExercicio*peso1 + this.notaDoTrabalho*peso2 + this.notaDaProva*peso3);
                System.out.println("\n\n----- Média final do aluno " + this.nomeDoAluno + ": " + this.mediaFinal + ";");
                if(this.mediaFinal >= 7){
                    System.out.println("\nParabéns!\nAluno aprovador.");
                }else{
                    System.out.println("\nInfelizmente seu aluno reprovou.");
                }

            }

        }
    }
}

public class MediaFinal{
    public static void main(String [] args){
        Aluno marcelo = new Aluno("Marcelo");
        marcelo.inserirNotas();
        marcelo.mediaFinal();
    }
}

