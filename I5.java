package com.arrayDemo;

public class I5 {
	public static void main(String[] args) {
		int arr[] = {10,20,50,20,80,90,10,80,70,30,100};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(i!=j && arr[i]==arr[j]) {
					System.out.println("Duplicate element: "+arr[j]);
				}
			}
		}
	}
}
