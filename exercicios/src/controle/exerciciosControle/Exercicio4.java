package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio4 {
/*4. Criar um programa que receba um número e diga se ele é um número primo.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Insira um número: ");
		
		int num1 = entrada.nextInt();
		int resultado = 0; 
		boolean contador = false;
		
		for(int i = 2 ; i < num1 ; i++) {
			
			resultado = num1 % i;
			if (resultado == 0) { contador = true;	break;}
		}
		if (num1 == 1) contador = true;
			entrada.close();
			if (contador == false) System.out.println(num1 + " é primo");
			else System.out.println(num1 + " não é primo");
			
		entrada.close();	
	}
		
}
