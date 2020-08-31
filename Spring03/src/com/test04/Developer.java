package com.test04;

public class Developer {
	
	private Emp emp;
	private String dept;

	public Developer() {
		super();
	}

	//Emp 클래스 안에 name과 salary가 게터와 세터로 존재
	public Developer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp + dept + "부서입니다";
	}

}
