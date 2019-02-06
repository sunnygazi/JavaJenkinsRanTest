package com.tt.classes;

//Java program to read data of various types using Scanner class. 
import java.util.Scanner;

public class Practice_Scanner {
	public static void main(String[] args) {
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		// String input
		String name = sc.nextLine();
		// Character input
		System.out.println("What's your gender?");

		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		System.out.println("What's your age?");
		int age = sc.nextInt();
		System.out.println("What's your Mobile Number?");
		long mobileNo = sc.nextLong();
		System.out.println("What's your GPA?");
		double cgpa = sc.nextDouble();

		// Print the values to check if input was correctly obtained.
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
	}
}
