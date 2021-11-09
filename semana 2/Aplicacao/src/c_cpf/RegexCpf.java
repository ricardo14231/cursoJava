package c_cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCpf {

	public static String adicionaMascaraCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})"); 
		Matcher matcher = pattern.matcher(cpf);
		
		if(cpf.length() != 11) {
			System.out.println("N�o tem 11 d�gitos.");
			return cpf;
		}else {
			return matcher.replaceAll("$1.$2.$3-$4");
		}
	}
	
}
