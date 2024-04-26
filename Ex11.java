package ex01;


/*

11) Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito.
Ap�s, calcular e escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito).
Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
 sen�o escrever a mensagem 'Saldo Negativo'.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N�mero da conta do cliente: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.print("D�bito: ");
        double debito = scanner.nextDouble();
        System.out.print("Cr�dito: ");
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
