package com.tt.classes;

public class ConstructorMethod {
	// Constructor
	public ConstructorMethod() {
		String a = "Learn Constructor";
		System.out.println(a);

	}

	// Method using void
	public void LearnMethod() {
		String b = "Learn Void Method";
		System.out.println(b);

	}

	// Method with data type
	public String LearnNONvoid() {
		String c = "Learn NonVoid Method";
		return c;
	}

	public static void main(String[] args) {
		ConstructorMethod CM = new ConstructorMethod();
		CM.LearnMethod();
		System.out.println(CM.LearnNONvoid());
	}

}
