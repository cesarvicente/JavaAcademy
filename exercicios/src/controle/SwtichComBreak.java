package controle;

import java.util.Scanner;

public class SwtichComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		entrada.close();

		switch (nota) {
		case 10, 9:
			conceito = "A";
			break;
		case 8, 7:
			conceito = "B";
			break;
		case 6, 5:
			conceito = "C";
			break;
		case 4, 3:
			conceito = "D";
			break;
		case 2, 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;
		default:
			conceito = "não informado!";

		}
		
		System.out.printf("Conceito: \"%s\"\n", conceito);
	}
}
