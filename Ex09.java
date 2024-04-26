package ex01;

/*

9) A jornada de trabalho semanal de um funcionário é de 40 horas.
 O funcionário que trabalhar mais de 40 horas receberá hora extra,
 cujo cálculo é o valor da hora regular com um acréscimo de 50%.
 Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
 o salário por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras,
 caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        int horasExtras = horasTrabalhadas - 160; // 40 horas por semana * 4 semanas = 160 horas
        if (horasExtras > 0) {
            double salarioTotal = (160 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
            System.out.println("Salário total do funcionário: R$ " + salarioTotal);
        } else {
            double salarioTotal = horasTrabalhadas * salarioPorHora;
            System.out.println("Salário total do funcionário: R$ " + salarioTotal);
        }
    }
}
