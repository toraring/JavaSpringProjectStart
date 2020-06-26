package spring.day0625.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ڹ� ���
		System.out.println("�ڹٹ���� ���� �� ��� �ּҺ�");
		Hello hello1 = new Hello();
		Hello hello2 = new Hello();
		System.out.println(hello1.getMessage());
	
		//�ڹٿ����� new�� �����Ҷ����� ���ο� ������ ������.
		System.out.println(hello1 == hello2);	//���۷��� �ּҺ�
		
		//���������
		System.out.println("����������� ���� �� ��� �ּ� ��");
		//������ xml ��������
		//���ø����̼� ����ø� �ʿ�
		//������ ����� web.xml�� ������ �Ǿ� �ִ�.
		ApplicationContext app1 = 
				new ClassPathXmlApplicationContext("appContext.xml");
		
		//Hello ��ü ����
		//��ȯŸ���� ObjectŸ���̹Ƿ� ����ȯ�� �ʿ���
		Hello h1 = (Hello)app1.getBean("hello"); //���1
		System.out.println(h1.getMessage());
		
		Hello h2 = app1.getBean("hello", Hello.class);
		System.out.println(h2.getMessage());
		
		//�⺻������ �������� �̱���
		System.out.println(h1 == h2); //��� true = ������ �ּҰ� ����.
		
		
	
	}

}