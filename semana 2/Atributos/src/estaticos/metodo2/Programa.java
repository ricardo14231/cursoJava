package estaticos.metodo2;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println(Produto.resultado(10, 50));
		
		System.out.println(Produto.pegarCPF("   999.999.999-72"));
		
		Produto p1 = new Produto();
		
		p1.mudeNomeProduto("Teste");
		System.out.println(p1.pegarCPF("  111.222.333-00"));
	}
	
}
