package com.mypackge.sort.mergesort;

import java.util.LinkedList;

public class MergeSort {
	
	public int[] sort(int[] arr,int start,int end) {
		
		if(start<end) {
		
		int mid=(start+end)/2;
		//System.out.println(mid);
		sort(arr,start,mid);
		sort(arr,mid+1,end);
		merge(arr,start,mid,end);
		}
		
		
		
		
		return arr;
	}
	
	
	private int[] merge(int []arr, int start,int mid,int end) {
		System.out.println("start: "+start+" mid: "+mid+"  end; "+end);
		int[] leftarr=new int[mid-start+2];
		int[] rightarr=new int[end-mid+1];
		
		int x=0,y=0;
		for(int i=start;i<=mid;i++) {
			leftarr[x]=arr[i];
			x++;
		}
		leftarr[x]=Integer.MAX_VALUE;
		for(int i=mid+1;i<=end;i++) {
			rightarr[y]=arr[i];
			y++;
		}
		rightarr[y]=Integer.MAX_VALUE;
		
		int k=0,m=0;
		for(int i=start;i<=end;i++) {
			
			if(leftarr[k]<=rightarr[m]) {
				
				arr[i]=leftarr[k];
				k++;
			}else {
				
				arr[i]=rightarr[m];
				m++;
			}
			
		}
		
		
//		for(int s:rightarr) {
//			System.out.println(s);
//		}
		
		return arr;
	}

}
