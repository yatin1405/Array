package com.arrayDemo;

public class A1 {
	public static void main(String[] args) {
		String str1[]= {"java","php","key","jason","sql","vishal"};
		String str2[]= {"java","vishal","yash","php","key"};
		for(int i=0; i<str1.length; i++) {
			for(int j=0; j<str2.length; j++) {
				if(str1[i].equals(str2[j])) {
					System.out.println(str2[j]);
				}
			}
		}
	}

}
