package alunos;

public class Programa {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Julio");
		a1.setCurso("Algoritmos");
		
		System.out.println(a1.getNome());
		System.out.println(a1.getCurso());
		
		Professor p1 = new Professor();
		p1.setSalario(1000.00);
		
		System.out.println(p1.getSalario());
		
	}
}
