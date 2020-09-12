package com.test03;

public class Emp {

	private String name;
	private int salary;

	//생성자
	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Emp() {
	}
	
	@Override
	public String toString() {
		return name + "의 월급은 " + salary + "만원 입니다";
	}


}
