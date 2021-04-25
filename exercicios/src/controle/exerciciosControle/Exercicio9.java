package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio9 {
	/*9. Crie um programa que recebe 10 valores e ao final imprima o maior número.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int maiorValor = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o valor %d: ", i);
			valor = entrada.nextInt();
			
			if (valor > maiorValor) maiorValor = valor;	
		}
		entrada.close();
		System.out.println("O Maior Valor Digitado foi: " + maiorValor);
		System.out.println("Programa Finalizado!");
		
	}
}
