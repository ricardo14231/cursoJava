package Projeto1;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("C�digo livro: ")));
		livro1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Pre�o livro: ")));
		livro1.setGenero(JOptionPane.showInputDialog("G�nero livro: "));
		livro1.setDescricao(JOptionPane.showInputDialog("Descri��o livro: "));
	
		livro1.exibeDados();
	}
	
}
