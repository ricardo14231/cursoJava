package com.ricardofarias.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(JsonApplication.class, args);
		
		
		JSONObject json = new JSONObject();
		
		json.put("nome", "Julio");
		json.put("sobrenome", "Smith");
		json.put("idade", 25);
		json.put("nome", "Julio");
		json.put("sobrenome", "Smith");
		json.put("idade", 25);
		
		System.out.println(json);
		
		PrintWriter salvar = new PrintWriter("./src/main/java/teste1.json");
		salvar.write(json.toJSONString());
		
		salvar.flush();
		salvar.close();
		
	}

}
