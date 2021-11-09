package com.estrutura.no;

public class NoTest {

	public static void main(String[] args) {
	
		No no1 = new No("Ricardo", 2);
		No no2 = new No("Alves", 1);
		No no3 = new No("de", 5);
		No no4 = new No("Farias", 10);
		
		no1.setNextNo(no2);
		no2.setNextNo(no3);
		no3.setNextNo(no4);
		//no1.setNextNo(no2);
		
		System.out.println("No1: " + no1);
		System.out.println("No2: " + no2);
		System.out.println("No3: " + no3);
		System.out.println("No4: " + no4);
		
		
		
	}
	
}
