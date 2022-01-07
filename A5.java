package com.arrayDemo;

import java.util.Arrays;

public class A5 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Original array: "+Arrays.toString(arr));
		int a=arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];	
		}
		arr[0]=a;
		System.out.println("New array is: "+Arrays.toString(arr));
	}

}
