package com.test04;

public class Emp {

	private String name;
	private String salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + "의 월급은 " + salary + "입니다 ";
	}

}
