package com.mypackge.linkedlist;

public class LinkedList {
	public Node head;
	private int count=0;
	public void add(int data) {
		count++;
		Node node=new Node(data);		
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public int size() {
		return count;
	}
	
	public void displayList() {
		Node n=head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data);
	}
	
	public int delete(int data) {
		Node node=head;
		if(head.data==data) {
			head=head.next;
		}
		
		while(node.next!=null) {
			if(node.next.data==data && node.next.next!=null) {
				node.next=node.next.next;
				break;
			}else if(node.next.data==data && node.next.next==null) {
				node.next=null;
				break;
				
			}
			node=node.next;
		}
		return data;
	}
	
	public int delete() {
		Node node=head;
		int temp=0;
		if(head!=null) {
			
		if(head.next==null) {
			temp=node.data;
			head=null;
		}else {
		
		while(node.next.next!=null) {
			node=node.next;
		}
		 temp=node.next.data;
		node.next=null;
		return temp;
		}

		}
		return temp;
	}
	
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		Node n=head;
		if(n!=null) {
		while(n.next!=null) {
			sb.append(n.data+", ");
			n=n.next;
		}
		sb.append(n.data);
		}
		return "["+sb+"]";
	}
	

}
