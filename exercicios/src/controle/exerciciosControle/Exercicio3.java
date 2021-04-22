package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio3 {
/*	3. 	Criar um programa que receba duas notas parciais,
  		calcular a média final. Se a nota do aluno for 
  		maior ou igual a 7.0 imprime no console "Aprovado",
  		se a nota for menor que 7.0 e maior do que 4.0
  		imprime no console "Recuperação", caso contrário 
  		imprime no console "Reprovado".			*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		
		System.out.printf("Digite a 1º nota: ");
		nota1 = entrada.nextDouble();
		System.out.printf("Digite a 2º nota: ");
		nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Media = "+media);
		if (media >= 7) System.out.println("Aprovado!");
		else if (media > 4) System.out.println("Recuperação");
		else System.out.println("Reprovado!");
		
		
		
		
		
		entrada.close();
		
	}
}
