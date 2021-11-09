package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		if(idade < 18) {
			System.out.println("Menor de idade.");
			System.out.println("Ano que vem será maior de idade.");
		}else {
			JOptionPane.showMessageDialog(null, "Maior de idade.");
		}
		
	}
	
}
