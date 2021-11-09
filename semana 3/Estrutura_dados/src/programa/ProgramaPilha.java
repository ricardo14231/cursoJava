package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo{

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		
		System.out.println("Stack: " + pilha);
		
		inserePush(pilha, "Caixa acústica 110");
		inserePush(pilha, "Caixa acústica 220");
		inserePush(pilha, "Note");
		deletaPop(pilha);
		deletaPop(pilha);
	}
	
}
