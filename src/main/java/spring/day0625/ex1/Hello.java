package spring.day0625.ex1;

public class Hello {

	private String msg = "Have a nice day";
	
	//출력 메서드
	public String getMessage()
	{//void가 아니면 리턴값을 꼭 줘야함.
		return "Hello 메서드 호출" + msg;
	}
}
