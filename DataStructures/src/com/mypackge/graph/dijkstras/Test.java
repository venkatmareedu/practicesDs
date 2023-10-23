package com.mypackge.graph.dijkstras;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Node> list=new ArrayList<>();
		list.add(new Node("A",0));
		list.add(new Node("B",1));
		list.add(new Node("C",2));
		
		list.add(new Node("D",3));
//		list.add(new Node("E",4));
//		list.add(new Node("F",5));
//		list.add(new Node("G",6));
		
		Graph graph=new Graph(list);
//		graph.addWeightGraph(0, 1, 2);
//		graph.addWeightGraph(0, 2, 5);
//		graph.addWeightGraph(1, 2, 6);
//		graph.addWeightGraph(1, 3, 1);
//		graph.addWeightGraph(1, 4, 3);
//		graph.addWeightGraph(2, 5, 8);
//		graph.addWeightGraph(3, 4, 4);
//		graph.addWeightGraph(4, 6, 9);
//		graph.addWeightGraph(5, 6, 7);
		
		
		//floyedwarshell
		
		graph.addWeightGraph(0, 1, 8);
		graph.addWeightGraph(0, 3, 1);
		graph.addWeightGraph(1, 2, 1);
		graph.addWeightGraph(2, 0, 4);
		graph.addWeightGraph(3, 2, 9);
		graph.addWeightGraph(3, 1, 2);
		
//		graph.bellmanFord(list.get(0));	
		
		
		graph.floydwarshall();
		
	}

}
