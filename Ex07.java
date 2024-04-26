package ex01;



/*
	7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        if (valor1 < valor2) {
            System.out.println(valor1 + ", " + valor2);
        } else {
            System.out.println(valor2 + ", " + valor1);
        }
    }
}
