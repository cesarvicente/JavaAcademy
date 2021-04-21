package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		boolean Reprovado = media < 4.5 && media >= 0;
		boolean Aprovado = media <= 10 && media >= 7.0;
		boolean Recuperacao = media < 7 && media >= 4.5;

		if (Aprovado) {
			System.out.println("Aprovado!");
			System.out.println("Paranbéns!");
		}

		if (Recuperacao) {
			System.out.println("Recuperação");
		}

		if (Reprovado) {
			System.out.println("Reprovado");
		}

		entrada.close();
	}
}
