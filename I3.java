package com.arrayDemo;

import java.util.Arrays;

public class I3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int pos=12;
		int x=80;
		System.out.println("Original array: "+Arrays.toString(arr));
		
		for(int i=arr.length-1; i>pos; i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=x;
		System.out.println("New  array  is: "+Arrays.toString(arr));
	}

}
