package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// ultimo a entrar � o primeiro a sair
		// last in -> first out
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("-----------------------");
		
		for (String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println("-----------------------");
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
		
		
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty(); retorna true ou false
		
		
		
	}
}