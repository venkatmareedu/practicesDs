package com.mypackge.graph.shortestpath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	ArrayList<Node> list=new ArrayList<>();
	public Graph(ArrayList<Node> list) {
		this.list=list;
	}
	public void undirectedGraph(int index1,int index2) {
		Node firstIndex=list.get(index1);
		Node secondIndex=list.get(index2);
		firstIndex.neighbours.add(secondIndex);
		secondIndex.neighbours.add(firstIndex);
	}
	
	
	
	public void BFS() {
		Queue<Node> queue=new LinkedList<>();
		queue.add(list.get(0));
		
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			currentNode.isVisited=true;
			ArrayList<Node> neighbour=currentNode.neighbours;
			for(Node n:neighbour) {
				if(!n.isVisited) {
					queue.add(n);
					n.isVisited=true;
					n.parent=currentNode;
					printShortestpath(n);
					System.out.println();
				}
			}
			
		}
		
		
		
	}
	
	
	public void printShortestpath(Node node) {
		if(node!=null) {
			printShortestpath(node.parent);
			System.out.print(node.name+" ");
		}

		
	}
	

}
