package Projeto1;

import javax.swing.JOptionPane;

public class Livro extends Produto{

	private String genero;
	
	public void exibeDados() {
		String msg = 
				"Código: " + getCodigo() + "\n" +
				"Preço: " + getPreco() + "\n" +
				"Gênero: " + getGenero() + "\n" + 
				"Descrição: " + getDescricao();
				
				JOptionPane.showMessageDialog(null, msg);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
