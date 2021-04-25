package controle.exerciciosControle;
import java.util.Scanner;

public class Exercicio1 {
/*	1. 	Criar um programa que receba um número e verifique
	 	se ele está entre 0 e 10 e é par;				*/
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Para sair digite -100");
		for (; numero != -100;) {
			System.out.printf("Insira um número: ");
			numero = entrada.nextInt();
			if (numero == -100) break;
			
			
			if (numero >= 0 && numero <= 10) System.out.printf("%d Está entre 0 e 10\n", numero);
			else System.out.printf("%d não está entre 0 e 10\n", numero);
			
			if (numero % 2 == 1) System.out.printf("e não é par");
			else System.out.println("e é par");
			System.out.println();
		}
		System.out.println("Programa Encerrado!");
		entrada.close(); 
		
	}
}
