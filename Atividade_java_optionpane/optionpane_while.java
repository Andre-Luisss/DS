package Atividade_java_optionpane;

import javax.swing.JOptionPane;

public class optionpane_while {
    public static void main(String[] args) {
      
        int numero = 0;
        

        while (numero >= 0) {
            String input = JOptionPane.showInputDialog("Digite um número positivo (ou negativo para sair):");

          
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
           
            }

            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
                continue; 
            }

          
            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "Número digitado: " + numero);
            } else {
                JOptionPane.showMessageDialog(null, "Você digitou um número negativo. Saindo...");
            }
        }

        JOptionPane.showMessageDialog(null, "Fim do programa.");
    }
}
    

