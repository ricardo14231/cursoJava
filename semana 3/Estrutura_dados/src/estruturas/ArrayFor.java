package estruturas;

import java.util.ArrayList;

public class ArrayFor {

	public static void main(String[] args) {
		
		ArrayList<String> pessoas = new ArrayList<String>();
		
		pessoas.add("Luiza ");
		pessoas.add("Gabriel");
		pessoas.add("Marcio");
		
		System.out.println("---------- Todas pessoas -------------");
		for( String s : pessoas) {
			System.out.printf("Posição %s\n", s);
		}
		
		System.out.println("----------- Começa com L --------------");
		for( String s : pessoas) {
			if(s.charAt(0) == 'L')
				System.out.printf("Nome %s\n", s);
		}
		
		System.out.println("------------- Pessoas e indices ----------------");
		System.out.println("Indo de um por um");
		int i = 0;
		
		for(String s : pessoas) {
			System.out.printf("Posição %d - %s\n", i, s);
			i++;
		}
	}
	
}
