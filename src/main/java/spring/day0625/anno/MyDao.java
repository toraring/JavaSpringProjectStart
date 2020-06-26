package spring.day0625.anno;

import org.springframework.stereotype.Component;

@Component
public class MyDao implements DaoInter {

	
	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println("str데이터 db에 추가성공");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println("num에 해당하는 데이터 삭제 성공");
	}

}
