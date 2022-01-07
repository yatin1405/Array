package com.arrayDemo;

public class A2 {
	public static void main(String[] args) {
		int arr[]= {45,68,7889,10,70,456,28,359};
		int average=0;
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}else if(min>arr[i]) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		average=sum/arr.length;
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("Average is: "+average);
	}

}
