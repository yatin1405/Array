package com.arrayDemo;

import java.util.Arrays;

public class I4 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Original array: "+Arrays.toString(arr));
		for(int i=0; i<arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("Reverse array: "+Arrays.toString(arr));
	}

}
