package spring.day0625.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("oracledb/oracleContext.xml");
		MyOracle my = (MyOracle)app.getBean("db");
		System.out.println(my);//tostring으로 만들면 이렇게도 됨. 첫번째 방법
//		System.out.println(my.toString()); //두번째 방법
		

	}

}
