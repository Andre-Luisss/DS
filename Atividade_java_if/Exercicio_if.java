package Atividade_java_if;

import java.util.Scanner;

public class Exercicio_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual e o codigo? ");
        int codigo = scanner.nextInt();

        if (codigo==1) {
            System.out.println("O alimento e perecivel");
        } else if (codigo<5) {
            System.out.println("O alimento e nao perecivel");
        } else {
            System.out.println("O alimento e kjdnfjw");
        }
    }
}