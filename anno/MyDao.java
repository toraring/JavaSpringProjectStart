package spring.day0625.anno;

import org.springframework.stereotype.Component;

@Component
public class MyDao implements DaoInter {

	
	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println("str������ db�� �߰�����");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println("num�� �ش��ϴ� ������ ���� ����");
	}

}