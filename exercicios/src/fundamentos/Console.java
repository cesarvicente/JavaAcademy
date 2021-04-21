package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d ", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: R$%.2f%n", 6524.58244);
		System.out.printf("Nome: %s%n", "João");
		
		
		// "@SuppressWarnings()" Serve para ignorar o alerta
		@SuppressWarnings("resource") 
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Digite o seu Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		
		
	}
}
