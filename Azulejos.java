/*Escreva um programa que calcule a quantidade de azulejos com medidas 0,35 altura x 0,30 largura, serão precisos para
 * completar uma parede com altura de 1,6 e largura de 2,6.*/

package Iniciante;

public class Azulejos {

	public static void main(String[] args) {
		
		
		double hp = 2.6, lp = 1.6, ha = 0.35, la = 0.3, qtde;
		
		qtde = (hp * lp) / (ha * la);
		
		System.out.println("A quantidade de azulejos é: " + qtde);
		

	}

}
