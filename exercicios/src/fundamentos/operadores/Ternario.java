package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a Nota do Aluno;");
		String nota1 = entrada.nextLine().replace(",", ".");
		double nota = Double.parseDouble(nota1);
		entrada.close();
		
		String reprovado = nota >= 4 ? 
				"Recuperação" : "Reprovado";	
		
		String resultado = nota >= 7 ? 
				"Aprovado" : reprovado;

		String teste = "-";
		
		System.out.println("+".equals(teste));
		
		System.out.println("O Aluno está " + resultado + " Com a nota de " + nota);
	}
}
