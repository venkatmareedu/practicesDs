package com.mypackge.tree.avl;

public class Test {

	public static void main(String[] args) {
		AVLTree tree=new AVLTree();
		tree.insert(23);
		tree.insert(12);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		
		
		System.out.println(tree.getBalance(tree.root));
		
		tree.levelOrder();

	}

}
