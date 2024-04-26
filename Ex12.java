package ex01;

/*

12) Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e quantidade m�nima
 em estoque de um produto. Calcular e escrever a quantidade m�dia
 ((quantidadem�dia = quantidade m�xima + quantidade m�nima)/2).
 Se a quantidade em estoque for maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra',
 sen�o escrever a mensagem 'Efetuar compra'.

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();
        System.out.print("Quantidade m�xima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();
        System.out.print("Quantidade m�nima em estoque: ");
        int quantidadeMinima = scanner.nextInt();
        
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
        
        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("N�o efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
