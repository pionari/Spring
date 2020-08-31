package com.test02;

public class messageBeanKo implements messageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 " + name);
	}

}
