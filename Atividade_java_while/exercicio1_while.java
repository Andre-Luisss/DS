package Atividade_java_while;

import java.util.Scanner;

public class exercicio1_while {

    public static void main(String[] args) {

        Scanner divisao = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num1 = divisao.nextInt();
       
        System.out.print("digite outro numero: ");
        int num2 = divisao.nextInt();

        while (num2==0){
        System.out.print("DIGITE UM VALOR DIFERENTE DE 0: ");
        num2 = divisao.nextInt();

        if (num2 == 0) {
            System.out.println("O segundo numero nao pode ser zero. Tente novamente.");
        }
        }
        if (num2>0){
            System.out.println("a divisao de "+ num1 +" por "+ num2 +" e "+ num1/num2);
        }
    }
    
}
