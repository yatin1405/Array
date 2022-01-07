package com.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class I1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index number between 0 to 9");
		int num = sc.nextInt();
		int arr[]= {00,10,20,30,40,50,60,70,80,90};
		if(num>=0 && num<=9) {
			for(int i=num; i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
		System.out.println(Arrays.toString(arr));
		}
	}
}
