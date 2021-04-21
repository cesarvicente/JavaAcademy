package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		/*
		 * calcular média de uma turma deve existir um contador de notas digitadas as
		 * notas digitadas devem ser validas (de 0 a 10) caso não seja tem que dar erro
		 * 
		 * se o usuario digitar -1 sair do programa e calcula a média e mostra a
		 * quantidade de notas calculadas
		 * 
		 */
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int contador = 0;

		System.out.println("Insira a nota -1 para finalizar a aplicação");
		while (nota != -1) {
			System.out.println("Digite o valor da nota: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				System.out.printf("Valor %.1f registrado!\n", nota);
				total += nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Valor Digitado não é válido");
			} else {
				System.out.println("Programa Encerrado!");
			}

		}
		entrada.close();
		
		double media = total / contador;

		System.out.printf("Foi Inserido %d notas: \n", contador);
		System.out.printf("A média das notas Digitadas é: %.1f", media);

		

	}

}
