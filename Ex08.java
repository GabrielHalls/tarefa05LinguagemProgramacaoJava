package ex01;

/*
8) Ler a hora de início e a hora de fim de um jogo de Xadrez
 (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
 sabendo-se que o tempo máximo de duração do jogo é de 24 horas
 e que o jogo pode iniciar em um dia e terminar no dia seguinte.


*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora de início do jogo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite a hora de fim do jogo: ");
        int fim = scanner.nextInt();
        
        int duracao;
        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }
        
        System.out.println("Duração do jogo: " + duracao + " horas");
    }
}
