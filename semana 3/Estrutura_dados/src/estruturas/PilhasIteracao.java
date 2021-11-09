package estruturas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhasIteracao {

	public static void main(String[] args) {
		
		Stack<Integer> pilhaList = new Stack<>();
		
		pilhaList.push(68);
		pilhaList.push(118);
		pilhaList.push(90);
		pilhaList.push(720);
		pilhaList.pop();
		
		ArrayList<String> listArray = new ArrayList<String>();
		listArray.add("ArrayList 1");
		listArray.add("ArrayList 2");
		
		List<String> listList = new ArrayList<>();
		listList.add("Lista 1");
		listList.add("Lista 2");
		
		System.out.println("Iterar Array: ");
		Iterator<String> iteratorArray = listArray.iterator();
		while(iteratorArray.hasNext()) {
			
			System.out.println(iteratorArray.next());
		}
		
		System.out.println("Iterar lista: ");
		Iterator<String> iteratorList = listList.iterator();
		while(iteratorList.hasNext()) {
			
			System.out.println(iteratorList.next());
		}
	}
}
