package ex01;

/*

1) Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (valor > 10) {
            System.out.println("� MAIOR QUE 10!");
        } else {
            System.out.println("N�O � MAIOR QUE 10!");
        }
    }
}
