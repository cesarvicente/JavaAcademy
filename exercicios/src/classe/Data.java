package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial,int mesInicial,int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada(){
		return String.format("%02d/%02d/%04d", dia, mes, ano);
		/*esse metodo é mais interessante
		 * porque como ele retorna o valor diretamente
		 * pode ser utilizado em multiplas plataformas
		 * ja a função println só é utilizada para
		 * exibir a saida no terminal (somente em java) 
		 */
	}
	
	void imprimeData() {
		System.out.println(dataFormatada());
		//System.out.println(dataFormatada("%02d/%02d/%04d", dia, mes, ano));
	}
	
	
}
