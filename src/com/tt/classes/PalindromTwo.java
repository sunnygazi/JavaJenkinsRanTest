package com.tt.classes;

import java.util.Scanner;

public class PalindromTwo {

	public static void main(String[] args) {
		System.out.print("Enter a word to reverse:");
		Scanner enter = new Scanner(System.in);
		String text = enter.nextLine();
		String check = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			check = check + text.charAt(i);
		}
		System.out.println("Reverse is:");
		System.out.println(check);

		if (text.equals(check)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}
