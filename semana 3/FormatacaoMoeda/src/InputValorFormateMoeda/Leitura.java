package InputValorFormateMoeda;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Calculando parcelas");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?"));
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
		double valorPacela = valorTotal / numParcelas;
		
		NumberFormat formatoValor = new DecimalFormat("R$ ###,###.00");
		JOptionPane.showMessageDialog(null, "O valor da percela é: " + formatoValor.format(valorPacela));
		
	}
	
}
