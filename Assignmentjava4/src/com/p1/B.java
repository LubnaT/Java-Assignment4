package com.p1;

public class B extends A{

	void bark() {
		System.out.println("bark");
	}
}


class Test{
	public static void main(String[] args) {
		B t = new B();
		t.eat();
		t.bark();
		
	}
	
	
}