package esporte;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {

	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		this.nome = JOptionPane.showInputDialog("Digite o nome");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
	
		System.out.println("Objeto atleta criado a partir da classe Atleta");
		System.out.println(
				String
					.format("Código: %d, Nome: %s, esporte: %s, Valor do patrocinio: %f",
					codigo, nome, esporte, valorPatrocinio));
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		String msg = "Valor de patrocinio: " + formatar.format(valorPatrocinio);
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public double atualizarValor(double taxa) {
		return this.valorPatrocinio += this.valorPatrocinio * taxa / 100;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public double getValorPatrocinio() {
		return valorPatrocinio;
	}
	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	
	
	
}
