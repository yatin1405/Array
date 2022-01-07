package com.arrayDemo;

public class B16 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,405,60,80,145};
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
