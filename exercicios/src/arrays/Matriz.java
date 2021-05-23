package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.printf("\nDigite a Quantidade de Notas ");
		int qtdNotas = entrada.nextInt();
		
		double[] [] notasTurma = new double[qtdAlunos][qtdNotas];
		
		for (int aluno = 0; aluno < notasTurma.length; aluno++) {
			
			for (int nota = 0; nota < notasTurma[aluno].length; nota++) {
				
				System.out.println("Informe");
			}
			
		}
		
		
		
		entrada.close();
		
	}
}
