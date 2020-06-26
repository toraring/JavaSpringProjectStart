package spring.day0625.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LogicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app1 = new ClassPathXmlApplicationContext("oracledb/annoContext.xml");
		
		LogicController logic1 = (LogicController)app1.getBean("logic");
		logic1.insert("Happy");
		logic1.delete("2");
	}

}
