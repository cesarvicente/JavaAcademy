package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		
		int f1a = 3 + 2;
		int f1b = 6 * f1a;
		int f1c = (int) Math.pow(f1b, 2);
		int f1d = 3 * 2;
		int r1 = f1c / f1d;
		
		int f2a = 1 - 5;
		int f2b = 2 - 7;
		int f2c = f2a * f2b;
		int f2d = f2c / 2;
		int r2 = (int) Math.pow(f2d, 2);
		
		int f3a = r1 - r2;
		int r3 = (int) Math.pow(f3a , 3);
		int r4 = (int) Math.pow(10, 3);
		
		int resultado = r3 / r4;
		System.out.println(resultado);
		
	}
}
