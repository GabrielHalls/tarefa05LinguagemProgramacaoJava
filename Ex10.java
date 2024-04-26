package ex01;

/*

10) Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 Sabendo-se que ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 
mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu sal�rio total

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sal�rio fixo: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Digite o valor das vendas efetuadas: ");
        double vendas = scanner.nextDouble();
        
        double comissao;
        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (vendas - 1500) * 0.05;
        }
        
        double salarioTotal = salarioFixo + comissao;
        System.out.println("Sal�rio total do vendedor: R$ " + salarioTotal);
    }
}
