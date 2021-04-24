package controle.exerciciosControle;

import java.util.Scanner;

public class Exercicio5 {
/*5.	 Refatorar o exercício 04, utilizando a estrutura switch. */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Insira um número: ");
		
		int num1 = entrada.nextInt();
		int resultado = 0; 
		int contador = 0;
		String primo = "";
		
		for(int i = 2 ; i < num1 ; i++) {
			
			resultado = num1 % i;
			if (resultado == 0) { contador++;	break;}
		} 
		if (num1 == 1) contador = 1;
			switch (contador) {
			case 0:
				primo = " é primo";
					break;
			case 1:
				primo = " não é primo";
			}
			
			System.out.println(num1 + primo);
			
			entrada.close();
		
		
	}
}
