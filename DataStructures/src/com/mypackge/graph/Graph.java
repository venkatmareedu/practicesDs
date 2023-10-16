package com.mypackge.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	public ArrayList<Node> graphlist;
	
	public Graph(ArrayList<Node> graphlist) {
		this.graphlist=graphlist;
		}
	
	public void undirectedGraph(int index1,int index2) {
		Node node1=graphlist.get(index1);
		Node node2=graphlist.get(index2);
		node1.neighbours.add(node2);
		node2.neighbours.add(node1);
		
	}
	
	public void directedGraph(int index1,int index2) {
		Node node1=graphlist.get(index1);
		Node node2=graphlist.get(index2);
		node1.neighbours.add(node2);
	}
	
	public void DFS() {
		if(graphlist==null) {
			return;
		}
		
		Stack<Node> stack=new Stack<>();
		
		stack.push(graphlist.get(0));
		
		while(!stack.isEmpty()) {
			Node currentNode=stack.pop();
			
			System.out.println(currentNode.name+" ");
			currentNode.isvisited=true;
			ArrayList<Node> neighbour=currentNode.neighbours;
			for(Node n:neighbour) {
				if(!n.isvisited) {
					stack.push(n);
					n.isvisited=true;
				}
					
			}
		}
	}
	
	
	public void BFS() {
		if(graphlist==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(graphlist.get(0));
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			
			
				System.out.println(currentNode.name+" ");
			currentNode.isvisited=true;
			ArrayList<Node> neighbour=currentNode.neighbours;
			for(Node n:neighbour) {
				if(!n.isvisited) {
					n.isvisited=true;
					queue.add(n);
					
				}
			}
			
			
		}
		
		
	}
	
	private void topologicalIsvisited(Node node,Stack<Node> stack) {
		
		ArrayList<Node> neighbour=node.neighbours;
		for(Node n:neighbour) {
			if(!n.isvisited) {
			topologicalIsvisited(n, stack);
			}
		}
		node.isvisited=true;
		stack.push(node);
		
	}
	
	public void topologicalSort() {
		Stack<Node> stack=new Stack<>();
		for(Node node:graphlist) {
			if(!node.isvisited) {
				topologicalIsvisited(node, stack);
			}
		}
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().name);
		}
		
	}
	
	

}
