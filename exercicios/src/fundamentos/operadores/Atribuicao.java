package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		@SuppressWarnings("unused")
		int c = a + b;
		
		c += b; // c = c + b
		a -= a; // c = c + a
		c *= b; // c = c + a
		c /= a; // c = c / a
		c %= 2; // c = c % 2 = resto da divisão por 2
		
		
	}
}
