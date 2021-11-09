package lambdas;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

	public static void main(String[] args) {
		
		List<String> nomes = List.of("ricardo", "alves de", "de", "farias");
		
		List<LocalTime> horas = List.of(LocalTime.of(0, 10), LocalTime.of(5, 30),
				LocalTime.of(2, 05), LocalTime.of(0, 03), LocalTime.of(1, 30));
	
		/*
		LocalTime temp = LocalTime.of(1,00);
		horas.stream()
			.filter(e -> 
			LocalTime.of(e.getHour() , e.getMinute())
			.compareTo(LocalTime.of(temp.getHour(), temp.getMinute())) == 1)		
			.forEach(System.out::println);
			*/
		
		nomes.stream()
			.filter(nome -> nome.contains(("ar")))
			.collect(Collectors.toList()).forEach(System.out::println);;
		
			
	}
}
