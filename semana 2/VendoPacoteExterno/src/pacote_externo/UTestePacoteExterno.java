package pacote_externo;

import Interno.Produto;

public class UTestePacoteExterno {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.nomeProd = "Luva";
		
		System.out.println(produto1.getNomeProd());
	}
	
}
