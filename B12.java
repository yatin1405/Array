package com.arrayDemo;

public class B12 {
	public static void main(String[] args) {
		int num[] = {15,28,97,68,312,45,789,456};
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}
}
