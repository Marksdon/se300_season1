package com.xzc.se300season1.test;

import priv.xzc.season2.collection.MyLinkedList;

public class ListTest {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.size());
		
		list.add(1, "e");
		System.out.println(list.size());
		
		
		
	}
}
