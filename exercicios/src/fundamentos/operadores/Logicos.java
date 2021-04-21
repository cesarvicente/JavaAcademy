package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		// Tabela verdade E
		System.out.println("\nTabela Verdade 'E' &&");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		// Tabela verdade OU ||
		System.out.println("\nTabela Verdade 'ou' ||");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// Tabela verdade ou exclusivo ^
		System.out.println("\nTabela Verdade 'xor' (ou exclusivo) ^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela verdade not ^
		System.out.println("\nTabela Verdade 'not' !");
		System.out.println(!true);
		System.out.println(!false);
	}
}
