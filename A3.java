package com.arrayDemo;

public class A3 {
	public static void main(String[] args) {
		int arr[]= {5,3,2,1,8,5,2,2,1,1};
		int sum=0;
		for(int i=0;i<arr.length; i++) {
			sum+=arr[i];
		}
		if(sum==30) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
