package estruturas;

import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("procuro", "fui achado hash");
		hashMap.put("procuro2", "fui achado hash 2");
	
		String value = hashMap.get("procuro");
		System.out.println(value);
		
		//---------------------------------
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("topico 1 da lista me achou");
		lista.add("topico 2 da lista me achou");
		
		String st1 = lista.get(0);
		System.out.println(st1);
	}
}
