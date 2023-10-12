package com.mypackge.test;



import com.mypackge.linkedlist.LinkedList;
import com.mypackge.queue.Queue;
import com.mypackge.sort.inerstionsort.InsertionSort;
import com.mypackge.sort.mergesort.MergeSort;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(122);
		list.add(14);
		list.add(78);
		list.add(1);
		list.add(56);
		list.add(453);
		Queue queue=new Queue();
		queue.add(234);
		queue.add(74);
		queue.add(54);
		queue.dequeue();
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());

		
		
		
		
	}

}
