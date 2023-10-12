package com.mypackge.queue;

import com.mypackge.linkedlist.LinkedList;

public class Queue {
	private LinkedList list=null;
	public void add(int data) {
		if(list==null) {
		list=new LinkedList();
		}
		list.add(data);
	}

	public int dequeue(){
		
		return list.delete();
	}
	
	public String toString() {
		return list.toString();
	}
	
}
