package Atividade_java_for;

import java.util.Scanner;

public class Exercicio1_for {
    public static void main(String[] args) {

        Scanner contagem = new Scanner(System.in);

        System.out.print("digite um numero para a contagem: ");
        int numero = contagem.nextInt();
         
        System.out.println("os numeros anteriores a "+ numero);

        for (int i = numero - 1; i >= 1; i--) {
            System.out.println(i);
        }
        
    }




}