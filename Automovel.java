/*Escreva um programa para determinar o consumo m�dio de um autom�vel
sendo fornecida a dist�ncia total percorrida e o total de combust�vel gasto.*/

package Iniciante;

import java.util.Scanner;

public class Automovel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double consumo;
		double distancia;
		double combustivel;

		System.out.print("Informe a distancia: ");
		distancia = entrada.nextDouble();
		System.out.print("Informe o total de combustivel: ");
		combustivel = entrada.nextDouble();

		consumo = distancia / combustivel;

		System.out.printf("O consumo m�dio do ve�culo �: %.2f", consumo);

	}
}
