package com.xzc.se300Season1.oop.polymorphism;

public class Animal {

	public void vioce(){
		System.out.println("普通动物叫声");
	}
}
class Cat extends Animal {
	public void vioce() {
		System.out.println("渺渺渺");
	}

	public void catchMouse(){
		System.out.println("catch mouse");
	}
}

class Dog extends Animal {
	public void vioce() {
		System.out.println("往往王");
	}

	public void guardDoor(){
		System.out.println("hold door");
	}
}

class Pig extends Animal {
	public void vioce() {
		System.out.println("pppp");
	}
}

class Triger extends Animal {
	public void vioce() {
		System.out.println("huhuhu");
	}
}

