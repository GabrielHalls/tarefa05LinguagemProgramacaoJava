package ex01;

/*
	4) Ler as notas da 1a. e 2a. avaliações de um aluno.
 Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
 (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
	
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da 1a. avaliação: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da 2a. avaliação: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        
        if (media >= 6) {
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Aluno REPROVADO");
        }
    }
}
