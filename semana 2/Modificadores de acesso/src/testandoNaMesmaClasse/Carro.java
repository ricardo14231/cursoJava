package testandoNaMesmaClasse;

public class Carro {

	private String nome;
	
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" � de 380km");
	}
	

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.nome = "Ferrari";
		
		carro.exibeVelocidade();	
	}
}

