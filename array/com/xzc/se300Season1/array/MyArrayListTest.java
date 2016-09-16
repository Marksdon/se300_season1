package com.xzc.se300Season1.array;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void testMyArrayList(){
		MyArrayList list = new MyArrayList(2);
		list.add("aaaa");
		list.add(new Human("sam"));
		list.add("aaaa");
		Human man = (Human)list.get(1);
		System.out.println(man.getName());
		System.out.println(list.idEmpty());
		System.out.println(list.lastIndexOf("aaaa"));
	}
	
	@Test
	public void testArrayCopy(){
		int[] a = {2,6,1,9,20};
		int[] b = Arrays.copyOf(a, 10);
		for(int i: b)
		System.out.print(i + "\t");
		
		List<Object> list = Arrays.asList(b);
		System.out.println(list.size());
//		for(Object i: list){
//			System.out.println(i);
//		}
	}
	
	
}
