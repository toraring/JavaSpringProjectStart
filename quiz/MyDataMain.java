package spring.day0625.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app4 = new ClassPathXmlApplicationContext("spring/test2/appQuiz.xml");
		
		MyData md = app4.getBean("my1", MyData.class);
		md.writeData();
		MyData md2 = app4.getBean("my2", MyData.class);
		md2.writeData();
	
	}

}
