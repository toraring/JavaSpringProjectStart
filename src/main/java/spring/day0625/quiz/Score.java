package spring.day0625.quiz;

public class Score {
	
	//������� 3���� �����(java,jsp,spring)
		private String java;
		private String jsp;
		private String spring;		
	
	//����Ʈ ������
		public Score(){
//			java = "90��";
//			jsp = "88��";
//			spring = "87��";	
		}
		
	//3������ ��� ���ڷ� �޴� ������.
		public Score(String java, String jsp, String spring)
		{
			this.java = java;
			this.jsp = jsp;
			this.spring = spring;
		}
	//������ setter, getter �ޱ�

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