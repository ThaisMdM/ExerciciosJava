/*Escreva um programa que lance 2 dados e os valores retornados sejam aleatorios. O jogo segue as seguintes regras:
 *Se a soma dos dados for 7 ou 11 na primeira rodada o usuário ganha.
 *Se a soma dos dados for 2,3 ou 12 o usuário perde.
 *Se a soma for 4, 5, 6, 8, 9 ou 10 essa passa a ser a pontuação do usuário. Para ganhar o usuário deve continuar a rolar os dados
 *até fazer sua pontuação. Se fizer 7 pontos antes ele perde.*/


import java.security.SecureRandom;

public class JogoDeDados {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {CONTINUE, GANHOU, PERDEU};

	public static int lancarDados() {

		int dado1 = 1 + randomNumbers.nextInt(6);
		int dado2 = 1 + randomNumbers.nextInt(6);

		int soma = dado1 + dado2;

		System.out.printf("O jogador jogou: %d + %d = %d%n", dado1, dado2, soma);

		return soma;
	}

	private static final int PERDE2 = 2;
	private static final int PERDE3 = 3;
	private static final int GANHA7 = 7;
	private static final int GANHA11 = 11;
	private static final int PERDE12 = 12;

	public static void main(String[] args) {

		int meusPontos = 0;
		Status statusJogo;

		int somaDados = lancarDados();

		switch (somaDados) {

		case GANHA7:
		case GANHA11:
			statusJogo = Status.GANHOU;
			break;
		case PERDE2:
		case PERDE3:
		case PERDE12:
			statusJogo = Status.PERDEU;
			break;
		default:
			statusJogo = Status.CONTINUE;
			meusPontos = somaDados;
			System.out.println("Meus pontos: " + meusPontos);
			break;
		}

		while (statusJogo == Status.CONTINUE) {

			somaDados = lancarDados();

			if (somaDados == meusPontos)
				statusJogo = Status.GANHOU;
			else if (somaDados == GANHA7)
				statusJogo = Status.PERDEU;
		}

		if (statusJogo == Status.GANHOU)
			System.out.println("Jogador venceu");
		else
			System.out.println("Jogador perdeu");
	}

}
