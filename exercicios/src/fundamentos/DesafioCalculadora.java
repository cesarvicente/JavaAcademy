package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Primeiro N�mero: ");
		String num1 = entrada.nextLine();
		
		System.out.println("Digite o Segundo N�mero: ");
		String num2 = entrada.nextLine();
		
		System.out.println("Digite a Opera��o ( + - * / % ): ");
		String op = entrada.nextLine();
		entrada.close();
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		
		System.out.printf("\nOpera��o Escolhida %s", op);
		
		double valor = "+".equals(op) ? numero1 + numero2 : 0;
		valor = "-".equals(op) ? numero1 - numero2 : valor;
		valor = "*".equals(op) ? numero1 * numero2 : valor;
		valor = "/".equals(op) ? numero1 / numero2 : valor;
		valor = "%".equals(op) ? numero1 % numero2 : valor;
		
		System.out.printf("\n %.2f %s %.2f = %.2f", numero1, op, numero2, valor);
		
	}
}
