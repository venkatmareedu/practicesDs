package com.mypackge.graph;

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
		list.add(new Node("H",7));
		
		
		Graph graph=new Graph(list);
//		graph.undirectedGraph(0, 1);
//		graph.undirectedGraph(0, 2);
//		graph.undirectedGraph(0, 3);
//		
//		graph.undirectedGraph(1, 4);
//		graph.undirectedGraph(2, 3);
//		graph.undirectedGraph(3, 4);
		
		graph.directedGraph(0, 2);
		graph.directedGraph(2, 4);
		graph.directedGraph(4, 7);
		graph.directedGraph(4, 5);
		graph.directedGraph(5, 6);
		graph.directedGraph(1, 2);
		graph.directedGraph(1, 3);
		graph.directedGraph(3, 5);

		graph.topologicalSort();
		
		
		//graph.BFS();
		
		//graph.DFS();
		
		

	}

}
