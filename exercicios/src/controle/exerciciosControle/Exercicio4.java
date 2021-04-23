package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio4 {
/*4. Criar um programa que receba um número e diga se ele é um número primo.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Insira um número: ");
		
		int num1 = entrada.nextInt();
		int resultado = 0; 
		
		for(int i = num1 - 1 ; i != 1 ; i--) {
			
			resultado = num1 % i;
			if (resultado == 0) {
				System.out.println(num1 + " não é primo");
				break;
				}
			if (i == 2) System.out.println(num1 + " é primo");
			} 
			
			entrada.close();
		}
		
	}
