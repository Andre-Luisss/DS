package Atividade_java_optionpane;

import javax.swing.JOptionPane;

public class optionpane_for {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite um número:");

        
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

      
        int numero = 0;
        try {
            numero = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            return; 
        }

       
        JOptionPane.showMessageDialog(null, "Os números de 1 até " + numero + ":");

    
        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
        }

        JOptionPane.showMessageDialog(null, "Fim do programa.");
    }

}