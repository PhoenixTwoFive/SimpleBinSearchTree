package binSearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree(0);
		for (int i = 0; i < 100; i++) {
			t.insertKey(i);
		}
		System.out.println(t);
		
	}

}
