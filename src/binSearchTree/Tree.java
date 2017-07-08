package binSearchTree;

public class Tree {
	
	private Tree left;
	private Tree right;
	private int key;
	
	public Tree(Tree l,int k,Tree r) {
		// TODO Auto-generated constructor stub
		this.left = l;
		this.key = k;
		this.right = r;
	}
	
	public Tree(int k) {
		// TODO Auto-generated constructor stub
		this.left = null;
		this.key = k;
		this.right = null;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}
	
	public void insertKey(int k){
		if (k==this.key) return;
		if (k<this.key){
			if(this.left!=null){
				this.left.insertKey(k);
			} else {
				this.left=new Tree(k);
			}
		} else {
			if(this.right!=null){
				this.right.insertKey(k);
			} else {
				this.right=new Tree(k);
			}
		}
	}
	
	public boolean contains(int k) {
		if(this.key==k){
			return true;
		} else {
			if(k<this.key){
				if(this.left!=null){
					return this.left.contains(k);
				} else {
					return false;
				}
			} else {
				if(this.right!=null){
					return this.right.contains(k);
				} else {
					return false;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String out="";
		out+=this.key+"\n";
		if(this.left!=null){
			out+=this.left.toString();
		} else {
			out+="┴";
		}
		out +="\t";
		if(this.right!=null){
			out+=this.right.toString();
		} else {
			out+="┴";
		}
		return out;
	}

}
