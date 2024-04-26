package ex01;

/*
3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de maçãs compradas: ");
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

