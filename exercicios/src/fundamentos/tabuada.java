package fundamentos;

public class tabuada {
	
	public static void main(String[] args) {
		
		int tabuada = 1;
		
		while (tabuada < 11) {
		int i = 1;	
		
		while (i < 11) {
				 
			int r = tabuada * i;
			System.out.println(tabuada + " X " + i + " = " + r);
			i = i + 1; 
			}
		System.out.println("\n\n");
		tabuada = tabuada + 1;
		}
	}
}
