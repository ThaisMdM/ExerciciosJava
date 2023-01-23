/*Escreva um programa que escolha a face de um dado aleatoriamente por 10 rodadas, imprima a frequencia de cada face.*/

import java.security.SecureRandom;

public class DadoArray {

	public static void main(String[] args) {
		
		SecureRandom aleatorio = new SecureRandom();		
		int [] frequencia = new int [7]; 
		
		
		for (int counter = 1; counter <= 10; counter ++)
			++frequencia [1 + aleatorio.nextInt(6)];
		
		System.out.printf("%s%15s%n", "Face", "Frequencia");
		
		
		for (int face = 1; face < frequencia.length; face++)
			System.out.printf("%3d%10d%n", face, frequencia[face]);		
	}
}