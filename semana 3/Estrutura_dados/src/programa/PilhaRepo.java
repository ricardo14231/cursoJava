package programa;

import java.util.Stack;

public class PilhaRepo {

	public static void inserePush(Stack<String> pilha, String s) {
		System.out.println();
		
		pilha.push(s);
		System.out.println("Push -> " + s);
		System.out.println("Stack:  " + pilha);
	}
	
	public static void deletaPop(Stack<String> pilha) {
		System.out.println();
		System.out.println("Pop -> ");
		
		String s = pilha.pop();
		System.out.println(s);
		System.out.println("Stack: " + pilha);
	} 
	
}
