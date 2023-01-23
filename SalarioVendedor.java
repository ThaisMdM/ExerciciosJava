/*Escreva um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas em valores efetuadas por ele.
 *O vendedor ganha 5% de comiss�o sobre suas vendas efetuadas, informar o seu nome, comiss�o do m�s, sal�rio fixo e sal�rio no final.
 *Importante: O usu�rio poder� informar os dados de valores utilizando . ou ,*/


package Iniciante;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double comissao, salarioFinal;

		System.out.print("Informe o nome do vendedor: ");
		String vendedor = entrada.nextLine();
		System.out.print("Informe o sal�rio fixo:R$ ");
		String salarioFixo = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o total das vendas:R$ ");
		String totalVendas = entrada.nextLine().replace(",", ".");

		double salFixo = Double.parseDouble(salarioFixo);
		double totVendas = Double.parseDouble(totalVendas);

		comissao = totVendas * 0.05;
		salarioFinal = salFixo + comissao;

		System.out.printf(
				"\nO vendedor %s tem um sal�rio fixo de R$ %.2f\nA comiss�o do m�s foi de R$ %.2f\nO sal�rio final do vendedor %s � R$ %.2f",
				vendedor, salFixo, comissao, vendedor, salarioFinal);
	}
}
