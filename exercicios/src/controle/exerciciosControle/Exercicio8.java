package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio8 {
/*8. Criar um programa que receba uma palavra e imprime no console letra por letra.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe a Palavra: ");
		String palavra = entrada.nextLine();
		
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		entrada.close();
		
	}
}
