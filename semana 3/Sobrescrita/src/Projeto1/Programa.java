package Projeto1;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código livro: ")));
		livro1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço livro: ")));
		livro1.setGenero(JOptionPane.showInputDialog("Gênero livro: "));
		livro1.setDescricao(JOptionPane.showInputDialog("Descrição livro: "));
	
		livro1.exibeDados();
	}
	
}
