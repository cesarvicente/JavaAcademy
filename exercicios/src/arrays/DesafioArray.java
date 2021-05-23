package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Quantas Notas você quer Informar?: ");
		int qtdNotas = entrada.nextInt();
		double[] nota = new double[qtdNotas];
		
		for (int i = 0; i < nota.length; i++) {
			
			System.out.printf("Digite a Nota %d: ", i + 1);
			nota[i] = entrada.nextDouble();
		}
		entrada.close();
		
		double total = 0;
		for (double forNotas: nota) {
			total += forNotas;
		}
		
		System.out.println("Media das notas: " + total / nota.length);
		
	}
}
