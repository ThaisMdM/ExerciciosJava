/*Escreva um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas em valores efetuadas por ele.
 *O vendedor ganha 5% de comissão sobre suas vendas efetuadas, informar o seu nome, comissão do mês, salário fixo e salário no final.
 *Importante: O usuário poderá informar os dados de valores utilizando . ou ,*/


package Iniciante;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double comissao, salarioFinal;

		System.out.print("Informe o nome do vendedor: ");
		String vendedor = entrada.nextLine();
		System.out.print("Informe o salário fixo:R$ ");
		String salarioFixo = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o total das vendas:R$ ");
		String totalVendas = entrada.nextLine().replace(",", ".");

		double salFixo = Double.parseDouble(salarioFixo);
		double totVendas = Double.parseDouble(totalVendas);

		comissao = totVendas * 0.05;
		salarioFinal = salFixo + comissao;

		System.out.printf(
				"\nO vendedor %s tem um salário fixo de R$ %.2f\nA comissão do mês foi de R$ %.2f\nO salário final do vendedor %s é R$ %.2f",
				vendedor, salFixo, comissao, vendedor, salarioFinal);
	}
}
