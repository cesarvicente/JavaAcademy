package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String i = ""; 
		while(!i.equalsIgnoreCase("Sair")) {
			System.out.println("Digite um valor: ");
			i = entrada.nextLine();
		}
		
		System.out.println("Você Saiu do Programa!");
		entrada.close();
	}
}
