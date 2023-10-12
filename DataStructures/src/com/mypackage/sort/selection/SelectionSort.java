package com.mypackage.sort.selection;

import com.mypackge.linkedlist.LinkedList;
import com.mypackge.linkedlist.Node;

public class SelectionSort {
	
	public LinkedList sort(LinkedList list) {
		
		int length=list.size();
		Node minnode=list.head;
		
		while(minnode.next!=null) {
			Node node=minnode.next;
			Node temp=minnode;
			while(node.next!=null) {
				if(node.data<temp.data) {
					temp=node;
				}
				node=node.next;
				
			}
			if(node.data<temp.data) {
				temp=node;
			}
			int t=temp.data;
			temp.data=minnode.data;
			minnode.data=t;
			minnode=minnode.next;
			System.out.println(list);
			
			
		}
		
		return list;
	}

}
