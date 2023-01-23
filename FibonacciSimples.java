/*Escreva um programa que retorne a sequencia fibonacci até o 15º elemento.*/

package Iniciante;

public class FibonacciSimples {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1;

		System.out.println(num1);

		for (int i = 0; i < 15; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.println(num1);
		}
	}

}
