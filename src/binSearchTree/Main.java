package binSearchTree;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rng = new Random();
		Tree t = new Tree(rng.nextInt());
		for (int i = 0; i < 100; i++) {
			t.insertKey(rng.nextInt());
			
		}
		
		System.out.println(t.preOrder());
		System.out.println(t.inOrder());
		System.out.println(t.postOrder());
		System.out.println(t);
	}

}
