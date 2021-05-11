package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = "06";
		d1.mes = "12";
		d1.ano = "1810";
		System.out.printf("Data 1: %s/%s/%s", d1.dia, d1.mes, d1.ano);
		
		Data d2 = new Data();
		d2.dia = "01";
		d2.mes = "02";
		d2.ano = "2010";
		
		System.out.println("\n");
		System.out.printf("Data 2: %s/%s/%s", d2.dia, d2.mes, d2.ano);
	}
}
