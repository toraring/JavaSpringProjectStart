package spring.day0625.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("oracledb/oracleContext.xml");
		MyOracle my = (MyOracle)app.getBean("db");
		System.out.println(my);//tostring���� ����� �̷��Ե� ��. ù��° ���
//		System.out.println(my.toString()); //�ι�° ���
		

	}

}