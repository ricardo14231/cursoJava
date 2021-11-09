package animal;

public class Peograma {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		g1.dormir();
		g1.peso = 7;
		g1.raca = "Siameses";
		
		System.out.println("------ Sobre o gato -----------");
		System.out.println(g1.peso);
		
		
		Cachorro c1 = new Cachorro();
		c1.dormir();
		c1.peso = 12;
		c1.raca = "Labrador";
		
		System.out.println("-------- Sobre o cachorro ----------");
		System.out.println(c1.peso);
	}
}
