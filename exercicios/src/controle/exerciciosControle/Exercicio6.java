package controle.exerciciosControle;
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	/*6. 	Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
	  		Armazene um numero aleatório em uma variável. O Jogador tem 10 
	  		tentativas para adivinhar o número gerado. Ao final de cada tentativa,
	  	 	imprima a quantidade de tentativas restantes, e imprima se o número
	  	  	inserido é maior ou menor do que o número armazenado. */
	public static void main(String[] args) {
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		System.out.println("Tente adivinhar o número inteiro aleatório!");
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		for (int i = 10; i > 0; i--) {
			System.out.printf("Você tem %d tentativas! \n", i);
			System.out.printf("Digite um número: ");
			numero = entrada.nextInt();
			
			if (numero < aleatorio) System.out.println("\nVocê errou, Tente novamente! \nDigite um numero MAIOR!!");
			else if (numero > aleatorio) System.out.println("\nVocê errou, Tente novamente! \nDigite um numero MENOR!!");
			else {System.out.println("Você Acertou!!"); break;}
		}
		entrada.close();
		System.out.println("O numero aleatório é: " + aleatorio);
		
		
	}
}
