package com.mypackge.sort.inerstionsort;

import com.mypackge.linkedlist.doubleliskedlist.LinkedList;
import com.mypackge.linkedlist.doubleliskedlist.Node;

public class InsertionSort {
	
	public LinkedList sort(LinkedList list) {
		
		Node node=list.head.next;
		
		while(node.next!=null) {
			
			int temp=node.data;
			Node n=node;
			while(n.previous!=null && n.previous.data>temp) {
				n.data=n.previous.data;
				n=n.previous;
				
			}
			n.data=temp;
			
			
			
			node=node.next;
			
		}
		
		return list;
	}

}
