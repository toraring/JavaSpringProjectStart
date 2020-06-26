package spring.day0625.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app3 = new ClassPathXmlApplicationContext("spring/test2/appContext3.xml");
		
		Person pp = app3.getBean("per", Person.class);
		pp.writeData();
		
		Person pp2 = app3.getBean("per2", Person.class);//规过1
		pp2.writeData();
		
		Person pp3 = (Person)app3.getBean("per2");//规过2
		pp3.writeData();
		
	}

}
