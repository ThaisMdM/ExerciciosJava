/*Escreva um programa que o usu�rio informe um n�mero inteiro e imprima se ele � um n�mero primo ou n�o.*/

package Iniciante;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i;
		int num;
		int cont = 0;

		System.out.print("Informe um n�mero: ");
		num = entrada.nextInt();

		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont ++;			
			}
		}

		if (cont == 2) {		
			System.out.println("\nO n�mero � Primo");
		} else {
			System.out.printf("\nO n�mero n�o � Primo");
		}
	}

}
