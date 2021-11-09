package esporte;


public class Programa {

	public static void main(String[] args) {
		
		Atleta t1 = new Atleta();
		//t1.inserirDados();
		t1.setValorPatrocinio(1000);
		
		Corredor c1 = new Corredor();
		c1.setValorPatrocinio(1000);
		
		int taxa = 15;
		t1.atualizarValor(taxa);
		c1.atualizarValor(taxa);
		
		System.out.println("Novo salário de atleta: " + t1.getValorPatrocinio());
		System.out.println("Novo salário de corredor: " + c1.getValorPatrocinio());
	}
	
}
