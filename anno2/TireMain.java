package spring.day0625.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = 
	new ClassPathXmlApplicationContext("oracledb/annoContext.xml");

//getBean의 name은 생각하면 클래스명으로 가져오고 아니면 명확한 이름으로 가져온다.
//생략할 시엔 tireController
//앞에 new면 Tirecontroller.class..해야.
//getbean뒤에 tireCont는 컴포넌트(in 'Thecontroller.java')에서 이름을 지정했기 때문에 가능.
TireController tc = (TireController)app.getBean("tireCont"); 
tc.process();
	}

}
