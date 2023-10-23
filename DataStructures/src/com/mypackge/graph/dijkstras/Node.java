package com.mypackge.graph.dijkstras;

import java.util.ArrayList;
import java.util.HashMap;

public class Node implements Comparable<Node>{
	public String name;
	public int index;
	public ArrayList<Node> neighbours=new ArrayList<>();
	public int distance;
	public HashMap<Node, Integer> weightMap=new HashMap<>();
	public Node parent;
	public Node(String name,int index) {
		this.name=name;
		this.index=index;
		this.distance=Integer.MAX_VALUE;
	}
	@Override
	public int compareTo(Node o) {
		
		return this.distance-o.distance;
	}

}
