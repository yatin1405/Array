package com.arrayDemo;

public class B13 {
	public static void main(String[] args) {
		int no[] = {-20,30,80,90,-158,7895,-1465};
		int sum=0;
		for(int i=0; i<no.length; i++) {
			sum+=no[i];
		}
		System.out.println(sum);
		int average = sum/no.length;
		System.out.println(average);
	}

}
