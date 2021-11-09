package com.litas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lista {

	public static void main(String[] args) {
		lista2();
	}
	
	public static void lista1() {
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Julio Farias");
		lista.add(3003.32);
		lista.remove("Julio Farias");
		
		System.out.println("Lista com elementos diferentes: " + lista);
		System.out.println("Lista com nome " + lista.get(0));
		System.out.println("Lista com salário: R$ " + lista.get(1));
		lista.clear();
		
		System.out.println("Lista vazia: " + lista);
	}
	
	public static void lista2() {
		List<String> lista = new ArrayList();
		lista.add("João da Silva");
		lista.add("Antonio Souza");
		lista.add("Marcelo");
		lista.remove("Lúcio Ferreira");
		
		System.out.println(lista.size());
		lista.forEach(System.out::println);
		
		System.out.println("--------------");
		List<Integer> itens = Arrays.asList(11,10,16,5,85,-1);
		itens.stream().filter(i -> i > 16).forEach(System.out::println);
	}
}
