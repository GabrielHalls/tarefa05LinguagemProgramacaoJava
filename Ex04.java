package ex01;

/*
	4) Ler as notas da 1a. e 2a. avalia��es de um aluno.
 Calcular a m�dia aritm�tica simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
 (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever tamb�m a m�dia calculada.
	
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da 1a. avalia��o: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da 2a. avalia��o: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("M�dia: " + media);
        
        if (media >= 6) {
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Aluno REPROVADO");
        }
    }
}
