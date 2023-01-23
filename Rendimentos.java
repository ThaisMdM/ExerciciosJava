/*Escreva um programa que o usuário insira o valor de depósito, a taxa de juros a.m e a qtde de meses do investimento
 *Imprimir o valor de juros composto por mês e o valor final do investimento.*/

package Iniciante;

import java.util.Scanner;

public class Rendimentos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o valor do depósito: ");
		double deposito = entrada.nextDouble();
		System.out.printf("Qual a taxa de juros por mês: ");
		double taxa = entrada.nextDouble();
		System.out.print("Quantidade de meses da aplicação: ");
		int mes = entrada.nextInt();
		System.out.println();
		
		double juros = 0;
		double montante = deposito;
				
		for (int i = 0; i < mes; i++) {		
			juros = montante * taxa;
			System.out.printf("Juros do %dº mês: %.2f\n", i+1, juros);
			montante += juros;
	}
		
		System.out.printf("\nO valor final da aplicação de R$ %.2f após %d meses é: R$ %.2f", deposito, mes, montante);		
		
		entrada.close();
	}

}
