package spring.day0625.ex4;

public class MyOracle {

	private String driver;
	private String url;
	private String user;
	private String password;
	
	public MyOracle(String driver, String url) {
			this.driver = driver;
			this.url = url;
//			this.user = user;
//			this.password = password;

	///setter getter
			
			
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		

	//toString �޼ҵ�
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[MyOracle]: \n driver: "+driver+"\nurl: "+url+
				"\nuser: "+user+"\npassword: "+password;
//		return "[MyOracle] \n driver: "+driver+"\nurl: "+url+
//				"\nuser: "+user+"\npassword: "+password;
	}
	
}
