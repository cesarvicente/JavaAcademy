package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();

		Data d2 = new Data(01,05,2010);

		System.out.println(d1.dataFormatada());

		d2.imprimeData();		
	}
}
