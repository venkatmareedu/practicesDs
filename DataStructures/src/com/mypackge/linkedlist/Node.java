package com.mypackge.linkedlist;

public class Node {
	public int data;
	public Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
			}
	
	public String toString() {
		return ""+this.data;
	}

}
