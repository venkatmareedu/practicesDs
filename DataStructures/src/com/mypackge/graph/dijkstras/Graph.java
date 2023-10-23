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
	
	
	
	public void floydwarshall() {
		
		int v[][]=new int[list.size()][list.size()];
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				
				if(i==j) {
					v[i][j]=0;
				}else if(list.get(i).weightMap.containsKey(list.get(j))) {
					v[i][j]=list.get(i).weightMap.get(list.get(j));
				}else {
					v[i][j]=100;
				}
				
			}
		}
		
//		
		
		
			for(int i=0;i<list.size();i++) {
				for(int j=0;j<list.size();j++) {
					for(int k=0;k<list.size();k++) {
					
					if(v[i][j]>v[i][k]+v[k][j]) {
						v[i][j]=v[i][k]+v[k][j];
						
					}
					
				}
				
			}
		}
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
			}
//		
		
	}
	
	
	
	void printParent(Node node) {
		if(node!=null) {
			printParent(node.parent);
			System.out.print(node.name+" ");
		}
	}
	

}
