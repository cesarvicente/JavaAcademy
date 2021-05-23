package classe.DesafioModulo;

public class Pessoa {

	String nome;
	double peso;
	double pesoInicial;
	
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		this.pesoInicial = peso;
		
	}
	
	
	void comer (Comida alimento) {
		this.peso += alimento.peso;
	}
	
	
	void imprimirPeso(){
		System.out.println("Peso Inicial: " + pesoInicial);
		System.out.println("Peso Pós-Janta: " + peso);
		
	}
	
}
