package spring.day0625.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = 
	new ClassPathXmlApplicationContext("oracledb/annoContext.xml");

//getBean�� name�� �����ϸ� Ŭ���������� �������� �ƴϸ� ��Ȯ�� �̸����� �����´�.
//������ �ÿ� tireController
//�տ� new�� Tirecontroller.class..�ؾ�.
//getbean�ڿ� tireCont�� ������Ʈ(in 'Thecontroller.java')���� �̸��� �����߱� ������ ����.
TireController tc = (TireController)app.getBean("tireCont"); 
tc.process();
	}

}