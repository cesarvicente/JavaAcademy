package classe.DesafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa cesar = new Pessoa("Cesar", 100);
		
		Comida Arroz = new Comida("Arroz", 0.500);
		Comida Feijao = new Comida("Arroz", 0.300);
		Comida Frango = new Comida("Arroz", 0.750);
		Comida Salada = new Comida("Arroz", 0.100);
		Comida Pudim = new Comida("Pudim", 1.700);
		
		
		
		cesar.comer(Arroz);
		cesar.comer(Feijao);
		cesar.comer(Frango);
		cesar.comer(Salada);
		cesar.comer(Pudim);
		
		cesar.imprimirPeso();
		
			
		
	}
}
