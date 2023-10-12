package com.mypackge.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
	
	public void BFS() {
		if(graphlist==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		
		
	}
	

}
