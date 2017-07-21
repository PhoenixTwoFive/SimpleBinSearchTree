package binSearchTree;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
	
	private Tree left;
	private Tree right;
	private Tree parent;
	private int key;
	
	public Tree(Tree l,int k,Tree r) {
		// TODO Auto-generated constructor stub
		this.left = l;
		this.key = k;
		this.right = r;
		this.parent = null;
	}
	
	public Tree(int k) {
		// TODO Auto-generated constructor stub
		this.left = null;
		this.key = k;
		this.right = null;
		this.parent = null;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
		this.left.setParent(this);
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
		this.right.setParent(this);
	}
	
	public void setParent(Tree p){
		this.parent = p;
	}
	
	public void insertKey(int k){
		if (k==this.key) return;
		if (k<this.key){
			if(this.left!=null){
				this.left.insertKey(k);
			} else {
				this.setLeft(new Tree(k));
			}
		} else {
			if(this.right!=null){
				this.right.insertKey(k);
			} else {
				this.setRight(new Tree(k));
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
	
	public void rotateLeft() {
		//TODO: implement
	}
	
	public void rotateRight() {
		//TODO: implement
	}
	
	public ArrayList<Integer> inOrder(){
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if(this.left!=null){
			retList.addAll(left.inOrder());
		}
		retList.add(key);
		if(this.right!=null){
			retList.addAll(right.inOrder());
		}
		return(retList);
	}
	
	public ArrayList<Integer> preOrder(){
		ArrayList<Integer> retList = new ArrayList<Integer>();
		retList.add(key);
		if(this.left!=null){
			retList.addAll(left.preOrder());
		}
		if(this.right!=null){
			retList.addAll(right.preOrder());
		}
		return(retList);
	}
	
	public ArrayList<Integer> postOrder(){
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if(this.left!=null){
			retList.addAll(left.postOrder());
		}
		if(this.right!=null){
			retList.addAll(right.postOrder());
		}
		retList.add(key);
		return(retList);
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
