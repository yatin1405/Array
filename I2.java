package com.arrayDemo;

import java.util.Arrays;

public class I2 {
	public static void main(String[] args) {
		String str[] = {"copy","cut","paste","hing","target","java","array"};
		String new_sty[]= new String[7];
		for(int i=0; i<str.length;i++) {
			new_sty[i]=str[i];
		}
		System.out.println(Arrays.toString(new_sty));
	}
}
