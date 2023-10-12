package com.mypackge.tree.binarytree;

public class Test {
	public static void main(String args[]){
		BinaryTree tree=new BinaryTree();
		tree.insert(12);
		tree.insert(45);
		tree.insert(53);
		tree.insert(43);
		
		tree.levelOrder();
		System.out.println(tree.search(12));
		tree.delete(12);
		tree.levelOrder();
//		System.out.println(tree.root.left.left.data);
		System.out.println(tree.search(12));
	}
}
