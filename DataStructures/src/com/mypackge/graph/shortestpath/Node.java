package com.mypackge.graph.shortestpath;

import java.util.ArrayList;

public class Node {
	public String name;
	public int index;
	public Node parent;
	public ArrayList<Node> neighbours=new ArrayList<>();
	 public boolean isVisited;
	public Node(String name,int index) {
		this.name=name;
		this.index=index;
		this.isVisited=false;
	}

}
