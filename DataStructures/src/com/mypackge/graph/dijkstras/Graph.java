package com.mypackge.graph.dijkstras;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
	ArrayList<Node> list=new ArrayList<>();
	public Graph(ArrayList<Node> list) {
		this.list=list;
		}
	
	public void addWeightGraph(int index1,int index2,int distance) {
		
		Node firstNode=list.get(index1);
		Node secondNode=list.get(index2);
		
		firstNode.neighbours.add(secondNode);
		firstNode.weightMap.put(secondNode, distance);
	}
	
	public void dijkstras(Node node) {
		
		PriorityQueue<Node> queue=new PriorityQueue<>();
		node.distance=0;
		queue.addAll(list);
		
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			ArrayList<Node> neighbour=currentNode.neighbours;
			for(Node n:neighbour) {
				if(queue.contains(n)) {
					
					if(n.distance>currentNode.distance+currentNode.weightMap.get(n)) {
						n.distance=currentNode.distance+currentNode.weightMap.get(n);
						n.parent=currentNode;
						queue.remove(n);
						queue.add(n);
						
					}
					
				}
				
			}
		}
		for(Node n:list) {
			System.out.print(n.name+" distance: "+n.distance +"   path:-->");
			printParent(n);
			System.out.println();
		}
		
		
	}
	
	
	
	public void bellmanFord(Node sourceNode) {
		sourceNode.distance=0;
		
		for(int i=0;i<list.size();i++) {
			for(Node node:list) {
				for(Node n:node.neighbours) {
					if(n.distance>node.distance+node.weightMap.get(n)) {
						n.distance=node.distance+node.weightMap.get(n);
						n.parent=node;
					}
				}
			}
		}
		for(Node n:list) {
			System.out.print(n.name+" distance: "+n.distance +"   path:-->");
			printParent(n);
			System.out.println();
		}
		System.out.println();
		for(Node node:list) {
			for(Node n:node.neighbours) {
				if(n.distance>node.distance+node.weightMap.get(n)) {
					System.out.println("graph has negative cycle....");
					return;
				}
			}
		}
		System.out.println("No negative graph...");
		for(Node n:list) {
			System.out.print(n.name+" distance: "+n.distance +"   path:-->");
			printParent(n);
			System.out.println();
		}
		
	}
	
	
	
	void printParent(Node node) {
		if(node!=null) {
			printParent(node.parent);
			System.out.print(node.name+" ");
		}
	}
	

}
