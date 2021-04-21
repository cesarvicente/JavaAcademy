package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Sal�rio: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o Segundo Sal�rio: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o Terceiro Sal�rio: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double mediaSalario = ((s1 + s2 + s3) / 3);
		
		System.out.println("M�dia Salarial: " + mediaSalario);
		
		entrada.close();
		
		
	}
}
