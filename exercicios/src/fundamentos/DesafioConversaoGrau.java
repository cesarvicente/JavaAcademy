package fundamentos;

public class DesafioConversaoGrau {

	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		int F = 10;
		
		double resultado = (F - ajuste) * fator; 
		System.out.println(F+"°F = "+resultado+"°C");
		
		F = 62;		
		resultado = (F - ajuste) * fator;		
		System.out.println(F+"°F = "+resultado+"°C");
		
	}

}
