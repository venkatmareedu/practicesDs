package com.mypackge.graph.shortestpath;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Node> list=new ArrayList<>();
		list.add(new Node("A",0));
		list.add(new Node("B",1));
		list.add(new Node("C",2));
		list.add(new Node("D",3));
		list.add(new Node("E",4));
		list.add(new Node("F",5));
		list.add(new Node("G",6));
		
		Graph graph=new Graph(list);
		graph.undirectedGraph(0, 1);
		graph.undirectedGraph(0, 2);
		graph.undirectedGraph(1, 3);
		graph.undirectedGraph(1, 6);
		graph.undirectedGraph(2, 3);
		graph.undirectedGraph(2, 4);
		graph.undirectedGraph(3, 5);
		graph.undirectedGraph(4, 5);
		graph.undirectedGraph(5, 6);
		
		graph.BFS();
		
		

	}

}
