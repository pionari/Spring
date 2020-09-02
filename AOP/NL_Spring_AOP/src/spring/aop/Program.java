package spring.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");

		Exam exam = (Exam) context.getBean("proxy");

		System.out.printf("total is %d \n", exam.total());
		System.out.printf("total is %f \n", exam.avg());
	}

	
}
