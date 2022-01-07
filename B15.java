package com.arrayDemo;

public class B15 {
	
	public static int index(int num[], int in) {
		if(num==null) {
			return -1;
		}
		for(int i=0; i<num.length; i++) {
			if(num[i]==in) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int num[] = {10,20,30,40,50,60,70,80,90};
		
		for(int i=0; i<num.length; i++) {
			int in = 40;
			//int b = index(num, in);
			System.out.println(index(num, in));
		}
	}

}
