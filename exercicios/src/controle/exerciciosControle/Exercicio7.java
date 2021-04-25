package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio7 {
/*7. 	Criar um programa que enquanto estiver recebendo números positivos,
 		imprime no console a soma dos números inseridos, 
 		caso receba um número negativo, encerre o programa.
 		Tente utilizar a estrutura do while.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int totalizador = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um valor:");
			numero = entrada.nextInt();
			if (numero > 0) {
				totalizador += numero;
			} else break;
		}
		System.out.println("A soma dos numeros é: " + totalizador);
		entrada.close();
		
		
	}
}
