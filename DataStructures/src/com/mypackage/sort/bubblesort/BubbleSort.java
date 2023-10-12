package com.mypackage.sort.bubblesort;

import com.mypackge.linkedlist.LinkedList;
import com.mypackge.linkedlist.Node;

public class BubbleSort {
	
	
	public LinkedList sort(LinkedList list) {
		
		int length=list.size();
		System.out.println(length);
		for(int i=0;i<length;i++) {
			Node node=list.head;
		while(node.next!=null) {
			if(node.data>node.next.data) {
				int temp=node.data;
				node.data=node.next.data;
				node.next.data=temp;
			}
			
			node=node.next;
		}
		System.out.println(list.toString());
		}
		
		
		return list;
	}

}
