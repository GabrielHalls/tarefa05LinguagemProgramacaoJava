package ex01;

/*
3) As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se foremcompradas pelo menos 12.
Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o custo total da compra.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o n�mero de ma��s compradas: ");
        int quantidade = scanner.nextInt();
        
        double custo;
        if (quantidade < 12) {
            custo = quantidade * 1.30;
        } else {
            custo = quantidade * 1.00;
        }
        
        System.out.println("Custo total da compra: R$ " + custo);
    }
}

