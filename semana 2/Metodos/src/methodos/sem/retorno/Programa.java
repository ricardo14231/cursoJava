package methodos.sem.retorno;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 500;
		conta1.titular = "Ricardo";
		conta1.sacar(20);
		
		System.out.println(conta1.saldo);
	}
	
}
