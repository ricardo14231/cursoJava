package br.com.pacote;

public class Pessoa {

	private String nome = "Ricardo";
	
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem é??..." + visitanteNome);
		return nome;
	}
}
