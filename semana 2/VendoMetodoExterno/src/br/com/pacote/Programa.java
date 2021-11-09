package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {

	public static void main(String[] args) {
		
		try {
			
			//Chama a classe e coloca ela no obj
			Object obj = Class.forName("br.com.pacote.Pessoa").newInstance();
			
			Method metodo = obj.getClass().getDeclaredMethod("pegarNome", String.class);
			
			metodo.setAccessible(true);
			
			String nome = (String) metodo.invoke(obj, "");
			
			System.out.println(nome);
		
				
		}catch (Exception err) {
			err.printStackTrace();
		}
	}
}
