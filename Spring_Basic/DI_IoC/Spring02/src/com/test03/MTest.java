package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

		Address lee = (Address) factory.getBean("lee");
		Address hong = (Address) factory.getBean("hong");

		System.out.println(lee);
		System.out.println(hong);

		((ClassPathXmlApplicationContext) factory).close();
		// AppicationContext에는 close가 없다 그래서 AppliciationContext로 캐스팅 하라는 알림이 뜬다
		// But, ClassPathXmlApplicationContext로 형변환 해서 쓸 것.
	}
}
