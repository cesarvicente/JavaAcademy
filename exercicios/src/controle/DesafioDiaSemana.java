package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o dia da Semana: ");
		String dia = entrada.nextLine().toUpperCase();
		entrada.close();
		
		boolean Domingo = (dia.equals("DOMINGO"));
		boolean Segunda = (dia.equals("SEGUNDA"));
		boolean Terca = (dia.equals("TERÇA"));
		boolean Quarta = (dia.equals("QUARTA"));
		boolean Quinta = (dia.equals("QUINTA"));
		boolean Sexta = (dia.equals("SEXTA"));
		boolean Sabado = (dia.equals("SABADO"));

		
		if (Domingo) {
			System.out.println(1);
		} else if (Segunda){
			System.out.println(2);
		} else if (Terca) {
			System.out.println(3);
		} else if (Quarta) {
			System.out.println(4);
		} else if (Quinta) {
			System.out.println(5);
		} else if (Sexta) {
			System.out.println(6);
		} else if (Sabado){
			System.out.println(7);
		} else {
			System.out.println("VALOR DIGITADO É INVALIDO!");
		}
	}
}
