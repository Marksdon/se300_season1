package com.xzc.se300Season1.oop.interfaceTest;

public interface Flyable extends B, C{
	int MAX_SPEED = 1000;
	int MIN_SPEED = 1;
	void fly();
}

interface B{
	void bbb();
}

interface C{
	void ccc();
}


class ClassTest implements Flyable,B,C{

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}