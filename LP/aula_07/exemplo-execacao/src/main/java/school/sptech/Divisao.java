package school.sptech;

import javax.swing.*;

public class Divisao {

    public static void main(String[] args) {

        String sNum1, sNum2;

        sNum1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        sNum2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        try {
            int num1 = Integer.parseInt(sNum1);
            int num2 = Integer.parseInt(sNum2);

            JOptionPane.showMessageDialog(null,
                    "A divisão do número " + num1 + " por " + num2 + " da: " + num1 / num2);
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero! \n" + erro,
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas números! \n" + erro,
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }
}
