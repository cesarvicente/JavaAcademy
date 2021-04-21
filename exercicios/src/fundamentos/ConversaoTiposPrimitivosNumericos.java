package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float)1.123456788888; // houve perda de informação (limite do float)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
