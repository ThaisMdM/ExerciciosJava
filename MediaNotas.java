/*Escreva um programa que receba o nome do aluno e 2 notas, depois calcular e imprimir os seguintes dados:
 * M�dia do aluno
 * Se m�dia >= 6 imprimir Aprovado, caso contr�rio Reprovado
 * Imprimir a m�dia da turma
 * Imprimir a maior e a menor m�dia
 * Imprimir a quantidade de alunos aprovados e reprovados */

package Iniciante;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		int alunos = 2, aprovado = 0, reprovado = 0;
		double media = 0, mediaG = 0, totalN = 0, mediaMaior = 0, mediaMenor = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < alunos; i++) {
			System.out.print("Nome do aluno: ");
			String nome = entrada.next();

			System.out.printf("Informe a primeira nota do aluno %s: ", nome);
			double n1 = entrada.nextDouble();
			System.out.printf("Informe a segunda nota do aluno %s: ", nome);
			double n2 = entrada.nextDouble();

			media = (n1 + n2) / 2;
			totalN = totalN + media;

			System.out.printf("\nA media do aluno %s foi: %.2f%n", nome, media);
			if (media >= 6) {
				aprovado++;
				System.out.println("Aprovado. Parabens!!!\n");
			} else {
				reprovado++;
				System.out.println("Reprovado. Estude mais!\n");
			}

			mediaMenor = mediaMaior;

			if (media > mediaMaior) {
				mediaMaior = media;
			} else if (media < mediaMaior) {
				mediaMenor = media;
			}

		}

		mediaG = totalN / alunos;

		System.out.printf("\nA m�dia da geral da turma �: %.2f", mediaG);
		System.out.print("\nA maior m�dia foi: " + mediaMaior);
		System.out.print("\nA menor m�dia foi: " + mediaMenor);
		System.out.print("\nAlunos Aprovados: " + aprovado + "\n");
		System.out.print("Alunos Reprovados: " + reprovado);

		entrada.close();
	}
}
