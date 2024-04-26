package ex01;

import java.util.Scanner;


/*
2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (valor >= 0) {
            System.out.println("É POSITIVO");
        } else {
            System.out.println("É NEGATIVO");
        }
    }
}
