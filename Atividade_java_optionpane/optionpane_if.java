package Atividade_java_optionpane;

import javax.swing.JOptionPane;

public class optionpane_if {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite um número:");

       
        int numero = Integer.parseInt(input);

       
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado é zero.");
        }
    }
}
