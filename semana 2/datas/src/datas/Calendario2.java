package datas;

import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Calendario2 {

	public static void main(String[] args) {
		Calendar calendarioAtual = (Calendar) Calendar.getInstance();
		 
	      
      	int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento "));

      	int ano_atual = calendarioAtual.get(Calendar.YEAR);
  
      	int idade = ano_atual - ano;
  
      	System.out.println(idade);
      	
      	
      	Calendar calendar = Calendar.getInstance();
    	TimeZone zona_local = calendar.getTimeZone();
    	

    	
    	String[] fusinho = TimeZone.getAvailableIDs();
    	for (String fuso: fusinho) {
    		System.out.println(fuso);
    	}

	}
}
