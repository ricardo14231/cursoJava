package operadores;

public class Operadores {

	public static void main(String[] args) {
		
		int a = 5;
		a += 3;
		System.out.println(a);
		
		int b = 5;
		b -= 3;
		System.out.println(b);
		
		int c = 5;
		c *= 3;
		System.out.println(c);
		
		
		int s = 5;
		int t = 3;
		
		System.out.println(s == t);
		System.out.println(s != t);
		System.out.println(s >= t);
		
		int x = 5;
		System.out.println("Int x = " + x);
		System.out.println("(x < 3 && x == 5)");
		System.out.print(x < 3 && x == 5);
		System.out.println("(x < 3 || x == 5)");
		System.out.print(x < 3 || x == 5);
		System.out.println("!(x < 3 && x == 5)");
		System.out.print(!(x < 3 && x == 5));
		
		
		int perfomance = 10;
		if(perfomance >= 9 && x < 10) {
			System.out.println("�timo player" + perfomance);
		} else 
		if(perfomance >= 8 && x < 9) {
			System.out.println("Mediano player" + perfomance);
		}	
		else {
			System.out.println("Desqualificado");
		}
	}
	
}
