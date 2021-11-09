package estruturas;

import java.util.HashMap;

public class HashIfFor0 {

	public static void main(String[] args) {
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Inglaterra", "Londres");
		capitais.put("Alemanha", "Berlim");
		capitais.put("Brasil", "Brasilia");
		
		for (String s : capitais.keySet()) {
			if(!s.equals("Inglaterra")) {
				System.out.println(s);
			}
		}
	}
	
}
