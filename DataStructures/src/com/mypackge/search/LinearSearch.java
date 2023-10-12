package com.mypackge.search;

public class LinearSearch {
	
	public int search(int[] arr,int data) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data) {
				return i;
			}
		}
		return -1;
	}

}
