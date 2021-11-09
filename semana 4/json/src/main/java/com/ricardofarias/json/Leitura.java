package com.ricardofarias.json;

import java.io.FileNotFoundException;

//Java program to read JSON from a file

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Leitura {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste1.json"));

		JSONObject jsonzinho = (JSONObject) obj;

		// get nome
		String nominho = (String) jsonzinho.get("nome");
		String sobrenominho = (String) jsonzinho.get("sobrenome");
		long idade = (long) jsonzinho.get("idade");
		
		System.out.println(nominho);
		System.out.println(sobrenominho);
		System.out.println(idade);

	}
	
}
