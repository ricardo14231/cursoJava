package Projeto1;

import javax.swing.JOptionPane;

public class Livro extends Produto{

	private String genero;
	
	public void exibeDados() {
		String msg = 
				"C�digo: " + getCodigo() + "\n" +
				"Pre�o: " + getPreco() + "\n" +
				"G�nero: " + getGenero() + "\n" + 
				"Descri��o: " + getDescricao();
				
				JOptionPane.showMessageDialog(null, msg);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
