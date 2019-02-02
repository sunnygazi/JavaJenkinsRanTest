package com.tt.classes;

class Person {

	String name;
	int age;

	void speak(String greeting) {
		System.out.println("hello!");
	}

	int yearsToRetirment() {
		int year = 65 - age;
		return year;
	}

}

class employee {

	public static void name(String[] args) {

		Person person1 = new Person();
		person1.name = "Mahabub";
		person1.age = 41;

		System.out.println("Person1 Name: " + person1.name);
		System.out.println("Person1 Age: " + person1.age);

		
		Person person2 = new Person();
		person2.name = "Nivan";
		person2.age = 6;
		
		System.out.println("Person 2 Name is :" +person2.name);
		System.out.println("Person 2 age is :" +person2.age);
		
		person2.speak("Hello there");
		
	}

}