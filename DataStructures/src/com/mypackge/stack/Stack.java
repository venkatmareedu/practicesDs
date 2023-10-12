package com.mypackge.stack;

import com.mypackge.linkedlist.*;

public class Stack {
	public LinkedList stack=null;
	public void push(int data) {
		if(stack==null) {
			stack=new LinkedList();
		}
		stack.add(data);
	}
	
	public int pop() {
		Node  node= stack.head;
		Node previous=null;
		while(node.next!=null) {
			previous=node;
			node=node.next;
		}
		previous.next=null;
		
		return -1;
	}
	
	public void display() {
		System.out.println(stack.toString());
	}
}
