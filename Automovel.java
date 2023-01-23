/*Escreva um programa para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida e o total de combustível gasto.*/

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

		System.out.printf("O consumo médio do veículo é: %.2f", consumo);

	}
}
