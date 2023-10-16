package com.mypackge.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
	Node root;
	
	public void insert(int data) {
		
		if(root==null) {
			root=new Node();
			root.data=data;
		}else {
			root=insertNode(data,root);
		}
		
	}
	
	public int getHeight(Node node) {
		if(node==null) {
			return 0;
		}
		return node.height;
	}
	
	public int getBalance(Node node) {
		
		return getHeight(node.left)-getHeight(node.right);
		
	}

	private Node insertNode(int data, Node node) {
		
		if(node==null) {
			Node n=new Node();
			n.data=data;
			n.height=1;
			return n;
		}
		
		else if(node.data>=data) {
			node.left=insertNode(data, node.left);
		}else {
			node.right=insertNode(data,node.right);
		}
		
		node.height=1+Math.max(getHeight(node.left),getHeight(node.right));
		
		int balance=getBalance(node);
		
		if(balance>1 && node.left.data<data) {
//			System.out.println(balance+" "+node.data);
			node.left=leftRotation(node.left);
			return rightRotation(node);
		}
		if(balance>1 && node.left.data>data) {
//			System.out.println(balance+" "+node.data);
			return rightRotation(node);
		}
		if(balance<-1 && node.right.data>data) {
//			System.out.println(balance+" "+node.data);
			node.right=rightRotation(node.right);
			return leftRotation(node);
		}
		if(balance<-1 && node.right.data<data) {
//			System.out.println(balance+" "+node.data);
			return leftRotation(node);
		}
		
		
		
		
		return node;
	}
	
	
	
	
	public void delete(int data) {
		
	}
	
	
	
	private Node rightRotation(Node imbalanceNode) {
		
		Node newNode=imbalanceNode.left;
		imbalanceNode.left=newNode.right;
		newNode.right=imbalanceNode;
		imbalanceNode.height=1+Math.max(getHeight(imbalanceNode.left), getHeight(imbalanceNode.right));
		newNode.height=1+Math.max(getHeight(newNode.left), getHeight(newNode.right));
		return newNode;
		
	}
	
	
	private Node leftRotation(Node imbalanceNode) {
		
		Node newNode=imbalanceNode.right;
		imbalanceNode.right=newNode.left;
		newNode.left=imbalanceNode;
		imbalanceNode.height=1+Math.max(getHeight(imbalanceNode.left), getHeight(imbalanceNode.right));
		newNode.height=1+Math.max(getHeight(newNode.left), getHeight(newNode.right));
		return newNode;
	}
	
	public void levelOrder() {
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			System.out.print(currentNode.data+" ");
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
			
		}
		
		
	}

}
