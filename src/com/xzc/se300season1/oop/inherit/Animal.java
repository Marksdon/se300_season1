package com.xzc.se300season1.oop.inherit;

public class Animal {
	String eye;

	public void run(){
		System.out.println("run run");
	}

	public void eat(){
		System.out.println("eat eat");
	}
}

class Mamal extends Animal{
	public void taiSheng(){
		System.out.println("taisheng");
	}
}

class Bird extends Animal{
	public void eggSheng(){
	}
	
}
