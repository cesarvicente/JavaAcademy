package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean fome = !sorvete;
		
		System.out.println("Comprar TV de 50 Polegadas: " + tv50);
		System.out.println("Comprar TV de 32 Polegadas: " + tv32);
		System.out.println("Familia tomou sorvete: " + sorvete);
		System.out.println("Familia Ficou com Fome : " + fome);
		
	}
}
