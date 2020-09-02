package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//<bean id="myNicknamePrn" class="com.test01.anno.MyNicknamePrn">
@Component
public class MyNicknamePrn {
	
	// autowire = "default"
	@Autowired
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
