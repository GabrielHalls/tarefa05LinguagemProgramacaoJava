package ex01;



/*

5) Ler o ano atual e o ano de nascimento de uma pessoa.
 Escrever uma mensagem que diga se ela poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu).

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.println("Pode votar este ano");
        } else {
            System.out.println("N�o pode votar este ano");
        }
    }
}
