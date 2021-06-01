package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //puxa chaves
		System.out.println(usuarios.values()); //puxa valores
		System.out.println(usuarios.entrySet()); // chave + valor format = [chave1=valor1, chave2=valor2]
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));	 	
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.remove(3));
		
		
		System.out.println("----------------");
		
		for (int chave: usuarios.keySet()) {
			System.out.print(chave + ": ");
			System.out.println(usuarios.get(chave));
		}
		
		System.out.println("----------------");
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + ": ");
			System.out.println(registro.getValue());
			
		}
		
		
	}
}
