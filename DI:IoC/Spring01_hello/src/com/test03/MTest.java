package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		// 기존 방식 
		// 1. Resource res = new FileSystemResource("src/com/test03/beans.xml");
		// 2. Resource res = new classPathResource("com/test03/beans.xml");
		//	  BeanFactory factory = new XmlBeanFactory(res);
		// 3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		messageBean english = (messageBean) factory.getBean("bean01");
		english.sayHello("Spring");
		
		messageBean korean = (messageBean) factory.getBean("bean02");
		korean.sayHello("스프링");
		
		/*
		 * BeanFactory <- ApplicationContext <- ClassPathXmlApplicationContext
		 * 스프링의 Applicationcontext 객체는 스프링 컨테이너 인스턴스이다
		 * 스프링은  Applicationcontext 인터페이스의 여러객체를 제공한다
		 * ClassPathXmlApplicationContext : 지정된 ClassPath에서 Xml 파일을 읽어서 bean 생성
		 * 
		 * IoC : 제어역전 (역전제어/제어반전)
		 * -> 객체생성(spring) != 사용
		 */
	}
}
