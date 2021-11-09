package estruturas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MostrarHashSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(12);
		tree.add(45);
		tree.add(63);
		tree.add(34);
				
		Iterator<Integer> iteratorTree = tree.iterator();
		
		System.out.println("Tree set data: ");
		while(iteratorTree.hasNext()) {
			System.out.print(iteratorTree.next() + " ");
		}
		
		System.out.println();
		
		HashSet<Integer> dset = new HashSet<>();
		dset.add(2);
		dset.add(12);
		dset.add(63);
		dset.add(34);
		
		Iterator<Integer> iteratorSet = dset.iterator();
		System.out.println("HashSet data: ");
		while(iteratorSet.hasNext()) {
			System.out.print(iteratorSet.next() + " ");
		}
	}
	
}
