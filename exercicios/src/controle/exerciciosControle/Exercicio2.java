package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio2 {
/*2. Criar um programa informa se o ano atual é um ano bissexto;*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira 0 para sair...");
		int ano = 1;
		
		while (ano != 0) {
			
			System.out.printf("Digite o Ano: ");
			ano = entrada.nextInt();
			if (ano == 0) break;
			if (ano % 4 == 0) System.out.printf("%d é um ano bissexto.", ano);
			else System.out.printf("%d não é um ano bissexto.", ano);	
			System.out.println("\n");
		}
		System.out.println("\n\nPrograma Encerrado!");
		
		entrada.close();
		
	}
}
