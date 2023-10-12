package com.mypackge.search;

import com.mypackge.sort.mergesort.MergeSort;

public class BinarySearch {
	
	public int search(int[] arr,int data) {
		MergeSort sort=new MergeSort();
		sort.sort(arr, 0, arr.length-1);
		
		int mid=(arr.length-1)/2;
		int c=0;
		while(c<=arr.length) {
			if(arr[mid]>data) {
				mid=mid/2;
				
			}else if(arr[mid]<data) {
				mid=(mid+arr.length)/2;
			}else {
				return mid;
			}
			c++;
		}
		
		
		return -1;
	}

}
