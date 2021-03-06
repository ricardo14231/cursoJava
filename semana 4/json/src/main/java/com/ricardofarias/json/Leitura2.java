package com.ricardofarias.json;

import java.io.FileNotFoundException;

//Java program to read JSON from a file


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jsonzinho = new JSONObject();

		jsonzinho.put("Nome", "Julio");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("idade", 25);
		jsonzinho.put("Nome", "Julio");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("idade", 25);
		
		JSONObject jsonzinho2 = new JSONObject();
		jsonzinho2.put("Nome", "Julio");
		jsonzinho2.put("Sobrenome", "Smith");
		jsonzinho2.put("idade", 25);
				
		System.out.println(jsonzinho);
		System.out.println(jsonzinho2);
		
		PrintWriter salvar = new PrintWriter("./src/main/java/teste4.json");
		salvar.write("[");
		salvar.write(jsonzinho.toJSONString());
		salvar.write(",");
		salvar.write(jsonzinho2.toJSONString());
		salvar.write("]");
		
		salvar.flush();
		salvar.close();
	}
}
