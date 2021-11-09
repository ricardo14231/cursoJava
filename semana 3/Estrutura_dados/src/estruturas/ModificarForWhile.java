package estruturas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Consegui " + (i+1));
		}
		
		System.out.println();
		
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})"); 
		Matcher matcher = pattern.matcher(example);
		
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println();
		
		Pattern pattern2 = Pattern.compile("\\d+");
		Matcher matcher2 = pattern2.matcher("hello1234goodboy789very2345");
	
		while (matcher2.find()) {
			System.out.println(matcher2.group());
		}
		
		System.out.println();
		
		String text = "John speak  and John writes about that, and John think 2021.10.10 about everything.";
		
		String nome = "(John)";
		
		Pattern p3 = Pattern.compile(nome);
		
		Matcher m3 = p3.matcher(text);
		
	
		while (m3.find()) {
			System.out.println("Found: " + m3.group());
		}
				
	}
	
}
