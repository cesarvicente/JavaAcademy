package controle;

public class For3 {

	public static void main(String[] args) {
		
		/*
		Quando a variavel é criada dentro do "for" ela não
		existe fora do bloco de codigo do for
		
		caso precise da variavel ela deve ser criada fora do bloco
		e dentro do for apenas a sentença ";"
		*/
		
		int i = 0;
		for(; i < 10; i++) {
			System.out.println("Dentro do For: " + i);
		}
		System.out.println("Saiu do for");
		System.out.println(i+"\n\n\n");
		
		for (int a = 0; a < 10; a++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", a, j);
			}
			System.out.println();
		}
	}
}
