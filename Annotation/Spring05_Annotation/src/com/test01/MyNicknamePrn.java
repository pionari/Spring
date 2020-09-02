package com.test01;

public class MyNicknamePrn {
	
	private Nickname nickName;

	public Nickname getNickName() {
		return nickName;
	}

	public void setNickName(Nickname nickName) {
		this.nickName = nickName;
	}
	
	public String toString() {
		return "내 별명은 " + nickName + "입니다."; 
	}

}
