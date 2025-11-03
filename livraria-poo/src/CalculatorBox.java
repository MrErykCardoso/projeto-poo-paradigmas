import javax.swing.JOptionPane;

public class CalculatorBox {
    public static void main (String [] args){
        String op;
        double result, n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite operador 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite operador 1: "));
        op = JOptionPane.showInputDialog("Digite a operação que deseja realizar (+, -, x, %): ");
        
        if (op == "+"){result = n1 + n2;}
        if (op == "-"){result = n1 - n2;}
        if (op == "x"){result = n1 * n2;}
        if (op == "%"){result = n1 - n2;}
        else{
            String e = "Error!";
        }

        if (op == "+" || op == "-" || op == "x" || op == "%") {
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
}
