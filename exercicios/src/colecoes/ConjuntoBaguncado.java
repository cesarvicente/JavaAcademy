package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		System.out.println("\n------ Uso do Conjunto HashSet ------");
		HashSet conjunto = new HashSet();
		
		// coletions não suporte primos primitivos
		conjunto.add(1.2); 
		conjunto.add(true);
		conjunto.add("Teste"); 
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto);
		
		conjunto.add("Teste");
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		System.out.println("\n----------------------------");
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		
		
		System.out.println(nums);
		System.out.println(conjunto); 
		
		conjunto.addAll(nums); // União entre dois conjuntos 
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); //remove todos os elementos em comum
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		
	}
}
