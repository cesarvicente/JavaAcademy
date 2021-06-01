package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//
		// Offer e Add -> adicional elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Offer lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Diferen�a � o comportamento 
		// ocorre quando a fila ta vazia
		
		// peek e element -> obter o pr�ximo elemento da fila
		// sem remover
		
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o
		System.out.println(fila.element());
		
		// fila.size(); -> ver tamanho da fila
		// fila.clear(); -> limpa a fila
		// fila.isEmpty; -> verifica se a fila ta vazia
		// fila.contains(...); saber se um determinado objeto(...) est� na fila
		
		//poll e remove -> obt�m o proxmo elemento da fila e remove!
		System.out.println("-------------------");
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); //lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}
}
