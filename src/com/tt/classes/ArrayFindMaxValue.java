package com.tt.classes;

public class ArrayFindMaxValue {

	public static void main(String[] args) {
		int [] x = {8,6,9,110,3,900};
		int max = 0;
		int len = x.length;
		
		for (int i=0; i<len; i++) {
			if (x[i]>max)
				max=x[i];
		}
		System.out.println(max);

	}//end of main

}//end of class
