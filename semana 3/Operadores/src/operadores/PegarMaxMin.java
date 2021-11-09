package operadores;

public class PegarMaxMin {

	public static void main(String[] args) {
		
		System.out.println("M�ximo: " + Math.max(5, 10));
		System.out.println("M�ximo: " + Math.min(5, 10));
	
		double a = 3.5;
		
		System.out.println("Ceil arr. para cima: " + Math.ceil(a));
		System.out.println("Ceil arr. para baixo: " + Math.floor(a));
		
		
		int[] arr = {4, 2, 5, 3, 6};
		
		int max =  arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(max,  arr[i]);
		}
		
		System.out.println("M�ximo: " + max);
	}
	
}
