package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 2345.987;
		
		//Print Formatado
		System.out.printf("%s %s tem %d anos e ganha R$%.2f\n"
				, nome, sobrenome, idade, salario);
		
		//Formatar Frase depois PRINT		
		String frase = String.format("%s %s tem %d anos e ganha R$%.2f"
				, nome, sobrenome, idade, salario);
		System.out.println(frase);
	
		
		
	}
}
