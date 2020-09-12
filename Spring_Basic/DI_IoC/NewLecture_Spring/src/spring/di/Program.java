package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 * 스프링에게 지시하는 방법으로 코드를 변경 (xml) Exam exam = new NewlecExam(); ExamConsole
		 * console = new InlineExamConsole(exam); // Exam과 ExamConsole이 결합되어있다 //
		 * Exam이라는 객체를 다른 interface에도 적용 가능하다 -> DI! 의존성 주입
		 * 
		 * console.setExam(exam); // 세터로 injection console.print();
		 * 
		 */

		// context가 지정한 xml를 읽어서 객체화 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		// xml에 지시된 id명으로 불러오기 -> object형으로 불러와지므로 캐스팅
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		// 자료형 명으로 불러오기
		// ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		exams.add(new NewlecExam(1,1,1,1));
		
		for (Exam e : exams)
			System.out.println(e);
				
	}
}
