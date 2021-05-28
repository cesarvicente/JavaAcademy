package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.printf("Digite a quantidade de Notas: ");
		int qtdNotas = entrada.nextInt();
		
		
		double[] [] notasTurma = new double[qtdAlunos][qtdNotas]; 
		//qtdNotas está dentro de cada elemento de qtdAlunos
		
		double total = 0;
		for (int aluno = 0; aluno < notasTurma.length; aluno++) {
			
			for (int nota = 0; nota < notasTurma[aluno].length; nota++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", nota+1, aluno+1 );
				notasTurma[aluno][nota] = entrada.nextDouble();	
				total += notasTurma[aluno][nota];
				
			}
			
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é: " + media);
		
		for (double [] notasAluno: notasTurma) {
			System.out.println(Arrays.toString(notasAluno));			
		}
		
		
		entrada.close();
		
	}
}
