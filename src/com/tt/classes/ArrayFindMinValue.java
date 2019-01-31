package com.tt.classes;

public class ArrayFindMinValue {

	public static void main(String[] args) {
		int [] x = {8,6,9,17,3,9};
		int min = 20;
		int len = x.length;
		
		for (int i=0; i<len; i++) {
		if (x[i]<min)
			min = x[i];
		}
		System.out.println(min);

	}//end of main

}//end of class
