package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	Data(){
		this(1, 1, 1970);
	}
	
	Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada(){
		final String formato = "%02d/%02d/%04d";
		return String.format(formato, this.dia, this.mes, this.ano);
		/*esse metodo é mais interessante
		 * porque como ele retorna o valor diretamente
		 * pode ser utilizado em multiplas plataformas
		 * ja a função println só é utilizada para
		 * exibir a saida no terminal (somente em java) 
		 */
	}
	
	void imprimeData() {
		System.out.println(this.dataFormatada());
		//System.out.println(dataFormatada("%02d/%02d/%04d", dia, mes, ano));
	}
	

	
}
