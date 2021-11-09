package datas;

import java.util.Calendar;


public class DataCalendario {

	public static void main(String[] args) {
		
		Calendar calendario1 = Calendar.getInstance();
		Calendar calendario2 = Calendar.getInstance();
		Calendar calendario3 = Calendar.getInstance();
		
		System.out.println("Calend�rio antes: " + calendario1.getTime());
		System.out.println("Calend�rio antes: " + calendario2.getTime());
		System.out.println("Calend�rio antes: " + calendario3.getTime());
		System.out.println("-------------------------------------");
		calendario1.add((Calendar.MONTH), 2);
		calendario2.add((Calendar.YEAR), 5);
		calendario3.add((Calendar.DAY_OF_MONTH), 10);
	
		System.out.println("Calend�rio com 2 meses: " + calendario1.getTime());
		System.out.println("Calend�rio com 5 anos: " + calendario2.getTime());
		System.out.println("Calend�rio com 10 dias no m�s: " + calendario3.getTime());
		System.out.println("-------------------------------------");
		

	}
	
}
