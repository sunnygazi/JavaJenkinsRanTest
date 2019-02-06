package com.tt.classes;

import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		String reverse = "";

		System.out.println("enter the input string");
		java.util.Scanner sce = new Scanner(System.in);
		String original = sce.nextLine();

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equals(reverse)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}
	
	} //end of main 

} // end of class 
