package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		messageBean bean01 = new messageBeanEn();
		bean01.sayHello("Spring");
		
		messageBean bean02 = new messageBeanKo();
		bean02.sayHello("스프링");
		
	}
}
