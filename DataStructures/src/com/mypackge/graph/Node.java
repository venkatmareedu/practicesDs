package com.mypackge.graph;

import java.util.ArrayList;

public class Node {

	public String name;
	public ArrayList<Node> neighbours =new ArrayList<>();
	public int index;
	public boolean isvisited=false;
	public Node(String name,int index) {
		this.name=name;
		this.index=index;
		
	}
	
	
}
