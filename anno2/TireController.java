package spring.day0625.anno2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tireCont")
public class TireController {

//	@Autowired //Tire로 주입할 것이 하나일때는 에러 없음
	//그러나 하나가 더 추가되 에러발생
	//따라서 위와같이 모호해지면 @Resource로 명확한 이름을 주어야함.
	@Resource(name = "canadaTire")
	Tire tire;
	public void process()
	{
		String s = tire.getTire();
		System.out.println(s);
	}
	
}
