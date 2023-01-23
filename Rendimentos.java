/*Escreva um programa que o usu�rio insira o valor de dep�sito, a taxa de juros a.m e a qtde de meses do investimento
 *Imprimir o valor de juros composto por m�s e o valor final do investimento.*/

package Iniciante;

import java.util.Scanner;

public class Rendimentos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o valor do dep�sito: ");
		double deposito = entrada.nextDouble();
		System.out.printf("Qual a taxa de juros por m�s: ");
		double taxa = entrada.nextDouble();
		System.out.print("Quantidade de meses da aplica��o: ");
		int mes = entrada.nextInt();
		System.out.println();
		
		double juros = 0;
		double montante = deposito;
				
		for (int i = 0; i < mes; i++) {		
			juros = montante * taxa;
			System.out.printf("Juros do %d� m�s: %.2f\n", i+1, juros);
			montante += juros;
	}
		
		System.out.printf("\nO valor final da aplica��o de R$ %.2f ap�s %d meses �: R$ %.2f", deposito, mes, montante);		
		
		entrada.close();
	}

}
