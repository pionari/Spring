package com.test01;

public class messageBeanImpl implements messageBean {

	private String fruit;
	private int cost;
	
	public messageBeanImpl() {
		this.fruit = "apple";
		this.cost = 1000;
	}
	
	public messageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}
	
	@Override
	public void sayHello() {
		System.out.printf("과일 : %s \t 가격 : %d\n ", fruit, cost );
	}

}
