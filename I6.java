package com.arrayDemo;

public class I6 {
	public static void main(String[] args) {
		String str[] = {"java","php","developer","java script","php","developer"};
		for(int i=0; i<str.length-1; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].equals(str[j]) && i!=j) {
					System.out.println("Duplicate element: "+str[j]);
				}
			}
		}
	}

}
