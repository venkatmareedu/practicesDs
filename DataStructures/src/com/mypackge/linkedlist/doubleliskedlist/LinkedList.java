package com.mypackge.linkedlist.doubleliskedlist;

public class LinkedList {
	public Node head;
	
	public void add(int data) {
		
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			node.previous=n;
		}
		
	}
	
	
	public String toString() {
		
		StringBuffer sb=new StringBuffer();
		Node n=head;
		while(n.next!=null) {
			sb.append(n.data+", ");
			n=n.next;
			
		}
		sb.append(n.data);
		
		return "["+sb+"]";
				
	}

}
