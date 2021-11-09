package estruturas;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<>();
		
		cars.add("Gol");
		cars.add("Fox");
		cars.add("Gol");
		cars.add("BMW");
		cars.add("Eco");
		
		for (String s : cars) {
			System.out.println(s);
		}
		
		System.out.println();
		
		for (String s : cars) {
			if(s.contains("co"))
				System.out.println(s);
		}
	}
	
}
