package com.test02;

public class Emp {

	private String name;
	private int salary;

	// 생성자
	public Emp() {
		super();
	}

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "" + name + "의 월급은 " + salary + "만원 입니다";
	}

}
