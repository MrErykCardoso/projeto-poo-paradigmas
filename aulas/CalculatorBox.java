import javax.swing.JOptionPane;

public class CalculatorBox {
    public static void main (String [] args){
        String op;
        double result = 0.0, n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite operador 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite operador 2: "));
        op = JOptionPane.showInputDialog("Digite a operação que deseja realizar (+, -, x, /s): ");

        if (op.equals("+")){
            result = n1 + n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        }
        else if (op.equals("-")){
            result = n1 - n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        }
        else if (op.equals("x")){
            result = n1 * n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        }
        else if (op.equals("/")){
            result = n1/n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro: Operador inválido.");
        }
    }
}
