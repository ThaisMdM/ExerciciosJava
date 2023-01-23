/*Escreva um programa que mostre os números primos entre 1 até 100.*/

package Iniciante;

public class NumerosPrimosImprimir {

	public static void main(String[] args) {

		int i;
		int k;

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (k = 1; k <= i; k++) {
				if ((i % k) == 0)
					++ counter;
				}
			
			if (counter == 2)
				System.out.println("O número: " + i + " é primo.");
		}

	}
}
