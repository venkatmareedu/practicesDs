package com.mypackge.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;





public class BinarySearchTree {
	
	public Node root;
	
	public Node insertNode(int data,Node node) {
		
		if(node==null) {
			node=new Node(data);
			
			
		} 
		else if(node.data>=data){
			node.left=insertNode(data, node.left);
			
		}else if(node.data<data) {
			node.right=insertNode(data, node.right);
		}
		return node;
		
	}
	
	public void insert(int data) {
		
		root=insertNode(data, root);
		
	}
	
	
public void levelOrder() {
		
		if(root==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node currentnode=queue.remove();
			System.out.print(currentnode.data+" ");
			if(currentnode.left!=null) {
				queue.add(currentnode.left);
			}
			if(currentnode.right!=null) {
				queue.add(currentnode.right);
			}
		}
		System.out.println();
	}


public void delete(int data) {
	if(root==null) {
		return;
	}
	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		Node currentNode=queue.remove();
		if(currentNode.data==data) {
			Node deepstNode=deepestNode(currentNode.right);
			currentNode.data=deepstNode.data;
			deletedeepestNode(currentNode.right);
			
			
		}else {
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
	}
}


private void deletedeepestNode(Node node) {
	if(node.left.left==null) {
		node.left=null;
		return;
	}
	deletedeepestNode(node.left);
	
}

private Node deepestNode(Node node) {
	if(node.left==null) {
		return node;
	}
	node=deepestNode(node.left);
	
	
	return node;

}

public void inOrder(Node node) {
	if(node==null) {
		return;
	}
	
	
	inOrder(node.left);
	System.out.println(node.data);
	inOrder(node.right);
	
	
}
	

}
