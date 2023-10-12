package com.mypackge.binarysearchtree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(12);
		tree.insert(45);
		tree.insert(62);
		tree.insert(18);
		tree.insert(71);
		tree.insert(89);
		tree.insert(9);
		tree.insert(11);
		
//		tree.inOrder(tree.root);
		tree.levelOrder();
		System.out.println();
		tree.delete(12);
		tree.levelOrder();

	}

}
