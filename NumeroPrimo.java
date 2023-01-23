/*Escreva um programa que o usuário informe um número inteiro e imprima se ele é um número primo ou não.*/

package Iniciante;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i;
		int num;
		int cont = 0;

		System.out.print("Informe um número: ");
		num = entrada.nextInt();

		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont ++;			
			}
		}

		if (cont == 2) {		
			System.out.println("\nO número é Primo");
		} else {
			System.out.printf("\nO número não é Primo");
		}
	}

}
