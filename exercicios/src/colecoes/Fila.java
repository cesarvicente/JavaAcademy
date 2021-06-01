package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//
		// Offer e Add -> adicional elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Offer lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Diferença é o comportamento 
		// ocorre quando a fila ta vazia
		
		// peek e element -> obter o próximo elemento da fila
		// sem remover
		
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		// fila.size(); -> ver tamanho da fila
		// fila.clear(); -> limpa a fila
		// fila.isEmpty; -> verifica se a fila ta vazia
		// fila.contains(...); saber se um determinado objeto(...) está na fila
		
		//poll e remove -> obtém o proxmo elemento da fila e remove!
		System.out.println("-------------------");
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); //lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}
}
