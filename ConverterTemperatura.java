/*Escreva um programa que receba uma temperatura em celsius,a converta e exiba em Kelvin (K), R�aumur (Re), Rankine (Ra) e Fahrenheit (F),
 * seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67.*/

package Iniciante;

public class ConverterTemperatura {

	public static void main(String[] args) {

		double c = 2.43;
		double k, f, re, ra;

		f = c * 1.8 + 32;
		k = c + 273.15;
		re = c * 0.8;
		ra = c * 1.8 + 32 + 459.67;

		System.out.println("A temperatura em Celsius �: " + c);
		System.out.println("A temperatura em Kelvin �: " + k);
		System.out.println("A temperatura em R�aumur �: " + re);
		System.out.println("A temperatura em Rankine �: " + ra);
		System.out.println("A temperatura em Fahrenheit �: " + f);

	}
}
