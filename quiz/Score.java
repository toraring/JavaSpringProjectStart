package spring.day0625.quiz;

public class Score {
	
	//멤버변수 3개를 만든다(java,jsp,spring)
		private String java;
		private String jsp;
		private String spring;		
	
	//디폴트 생성자
		public Score(){
//			java = "90점";
//			jsp = "88점";
//			spring = "87점";	
		}
		
	//3과목을 모두 인자로 받는 생성자.
		public Score(String java, String jsp, String spring)
		{
			this.java = java;
			this.jsp = jsp;
			this.spring = spring;
		}
	//각각의 setter, getter 받기

		public String getJava() {
			return java;
		}

		public void setJava(String java) {
			this.java = java;
		}

		public String getJsp() {
			return jsp;
		}

		public void setJsp(String jsp) {
			this.jsp = jsp;
		}

		public String getSpring() {
			return spring;
		}

		public void setSpring(String spring) {
			this.spring = spring;
		}
		
		
}
