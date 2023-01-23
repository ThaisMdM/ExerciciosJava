/*Escreva um programa em que o usuário insira 2 valores e imprima os valores de forma que a primeira variavel passe a ter o valor da segunda,
 *e a segunda variavel passe a ter o valor da primeira.*/

package Iniciante;

import java.util.Scanner;

public class TrocaDeValores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b, armazenar;

		System.out.print("Insira o valor de A: ");
		a = entrada.nextInt();
		System.out.print("Insira o valor de B: ");
		b = entrada.nextInt();

		armazenar = a;
		a = b;
		b = armazenar;

		System.out.printf("\nO novo valor de A é: %d\nO novo valor de B é: %d", a, b);

		entrada.close();
	}

}
