/*Escreva um programa para que o usu�rio insira a qtde de pessoas entrevistadas, informando o sexo do entrevistado e sua altura.
 *Imprima a maior e a menor altura, a medida da altura de cada sexo.*/


package Iniciante;

import java.util.Scanner;

public class ConjuntoHM {

	public static void main(String[] args) {
		
		
		int sexo, qtdeMulheres = 0, qtdeHomens = 0;
		float altura = 0, somaH = 0, somaM =0, mediaH = 0, mediaM = 0, maior = 0, menor = 3;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe quantas pessoas ser�o entrevistas: ");
		int pessoas = entrada.nextInt();
		
		for (int i = 0; i < pessoas; i++) {
			System.out.printf("Digite o sexo da %d� pessoa: 1 - Homem, 2- Mulher: ", i+1);
			sexo = entrada.nextInt();
			
			System.out.printf("Insira a altura da %d� pessoa: ", i+1);
			altura = entrada.nextFloat();
			
		if (sexo == 1) {
			qtdeMulheres ++;
			somaM += altura;
		} else if (sexo == 2) {
				qtdeHomens ++;
				somaH += altura;
			}else {
				System.out.println("Valor inv�lido");
			}
		
		
		maior = menor;
		
		if (altura < menor) {
			menor = altura;	
		} else if (altura > menor)  {
			maior = altura; 
		}
	}
				
		mediaH = somaH / qtdeHomens;
		mediaM = somaM / qtdeMulheres;		
		
		System.out.println("\nA maior altura �: " + maior);
		System.out.println("A menor altura �: " + menor);
		if (qtdeHomens > 0) {
			System.out.print("\nA m�dia da altura dos Homens �: " + mediaH);
		} else {
			System.out.println("\nN�o houve homens entrevistados.");
		}
		if (qtdeMulheres > 0) {
			System.out.print("\nA m�dia da altura das Mulheres �: " + mediaM);
		} else {
			System.out.println("\nN�o houve mulheres entrevistadas.");
		}
		
		entrada.close();

	}

}
