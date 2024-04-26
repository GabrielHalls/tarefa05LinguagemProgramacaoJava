package ex01;

/*

9) A jornada de trabalho semanal de um funcion�rio � de 40 horas.
 O funcion�rio que trabalhar mais de 40 horas receber� hora extra,
 cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
 Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s,
 o sal�rio por hora e escreva o sal�rio total do funcion�rio, 
que dever� ser acrescido das horas extras,
 caso tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas).

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o sal�rio por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        int horasExtras = horasTrabalhadas - 160; // 40 horas por semana * 4 semanas = 160 horas
        if (horasExtras > 0) {
            double salarioTotal = (160 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
            System.out.println("Sal�rio total do funcion�rio: R$ " + salarioTotal);
        } else {
            double salarioTotal = horasTrabalhadas * salarioPorHora;
            System.out.println("Sal�rio total do funcion�rio: R$ " + salarioTotal);
        }
    }
}
