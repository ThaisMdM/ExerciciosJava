/*Escreva um metodo que retorno a sequencia fibonacci at� o 15� elemento. */

package Iniciante;

public class FibonacciMetodo {

	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
			System.out.println(fibo(i));
		}

	}

}
