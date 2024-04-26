package ex01;


/*

11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
 senão escrever a mensagem 'Saldo Negativo'.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número da conta do cliente: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.print("Débito: ");
        double debito = scanner.nextDouble();
        System.out.print("Crédito: ");
        double credito = scanner.nextDouble();
        
        double saldoAtual = saldo - debito + credito;
        System.out.println("Saldo atual: " + saldoAtual);
        
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
