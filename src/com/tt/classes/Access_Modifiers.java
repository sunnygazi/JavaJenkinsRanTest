package com.tt.classes;

public class Access_Modifiers {
	// private is the most restricted
	// default
	// protected
	// public

	static int a = 10;
	static int b = 5;

	// private: this method can't be accessed anywhere other than inside of this
	// class
	private void add() {
		int c;
		c = a + b;
		System.out.println(c);
	}

	// public: can be accessed anywhere in this program as long as you have
	// --an instance of this class to call it from
	public void sub() {
		int c;
		c = a - b;
		System.out.println(c);
	}

	// protected: this method can only be accessed inside of this package
	// --and from subclasses of this class
	protected void mul() {
		int c;
		c = a * b;
		System.out.println(c);
	}

	// Default: this method can only be accessed inside this package
	void div() {
		int c;
		c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Access_Modifiers op = new Access_Modifiers();
		op.add();
		op.sub();
		op.mul();
		op.div();

	}

}
