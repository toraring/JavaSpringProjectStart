package spring.day0625.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic")
public class LogicController {

//	DaoInter daoInter;
	
//	@Autowired	//자동주입
	@Resource(name = "myDao") //아주 정확한 이름을 줄때 쓰임
	MyDao dao; 
	
	public LogicController(MyDao dao) {
		this.dao = dao;		
	}
	
	public void insert(String str){
		
		dao.insertData(str);
	}
	
	public void delete(String num) {
		dao.deleteData(num);
	}
}
