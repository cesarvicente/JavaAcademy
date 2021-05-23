package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)= se a for alterado B irá manter o valor de 2
		
		a++;
		b--;
		
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.dia = 12;
		
		d1.ano=2025;
		d1.imprimeData();
		d2.imprimeData();
		
		
		resetData(d1);
		
		d1.imprimeData();
		d2.imprimeData();
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	}
	
	static void resetData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
	static void alterarPrimitivo(int a) {
		a++;
	}
	
	
}
