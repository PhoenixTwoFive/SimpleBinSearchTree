package binSearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree(0);
		t.insertKey(50);
		for (int i =51; i < 100; i++) {
			t.insertKey(i);
		}
		for (int i = 49; i >=0; i--) {
			t.insertKey(i);
		}
		System.out.println(t.preOrder());
		System.out.println(t.inOrder());
		System.out.println(t.postOrder());
	}

}
