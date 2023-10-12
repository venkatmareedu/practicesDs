package com.mypackge.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	public Node root=null;
	
	public void insert(int data) {
		Node newnode=new Node(data);
		if(root==null) {
			root=newnode;
		}else {
			
			Queue<Node> queue=new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty()) {
				Node currentNode=queue.remove();
				if(currentNode.left==null) {
					currentNode.left=newnode;
					break;
				}else if(currentNode.right==null) {
					currentNode.right=newnode;
					break;
				}else {
					queue.add(currentNode.left);
					queue.add(currentNode.right);
				}
			}
		}
		
	}
	
	public int search(int data) {
		if(root==null) {
			return -1;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			if(currentNode.data==data) {
				return currentNode.data;
			}else {
				if(currentNode.left!=null)
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		
		return -1;
		
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
				Node deepnode=deepestNode(root);
				currentNode.data=deepnode.data;
				deletedeepestNode();
				break;
			}
			else {
			
				if(currentNode.left!=null)
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			
			}
		}
	}
		
	
	
	private void deletedeepestNode() {
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		Node prevousNode=null;
		while(!queue.isEmpty()) {
			Node currentnode=queue.remove();
			
			
			if(currentnode.left==null) {
				prevousNode.right=null;
				break;
			}
			else if(currentnode.right==null) {
				currentnode.left=null;
				break;
			}
			else {
				queue.add(currentnode.left);
				queue.add(currentnode.right);
			}
			prevousNode=currentnode;
		}
		
		
	}
	
	private Node deepestNode(Node node) {
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(node);
		Node currentnode=null;
		while(!queue.isEmpty()) {
			currentnode=queue.remove();
			if(currentnode.left!=null) {
				queue.add(currentnode.left);
			}
			if(currentnode.right!=null) {
				queue.add(currentnode.right);
			}
		}
		
		return currentnode;
	}
	
	
	public void inOrder(Node node) {
		if(node==null) {
			return;
		}
		
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
		
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
	

}
