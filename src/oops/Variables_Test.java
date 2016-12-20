package oops;

public class Variables_Test {
	
	//Class Variable
	String strURL = "http://www.amazon.com";
	//Instance variable
	static String strURL1 = "http://www.amazon.com";
	
	public void login()
	{
		//Local variable
		String strUsername = "naresh";
		String strPassword = "testing";
		System.out.println("Username is:"+strUsername);
		System.out.println("New URL is :" + strURL1);
		
	}
	
	public void Search()
	{
		System.out.println("URL is:"+strURL);
	}

	public static void main(String[] args) {

		Variables_Test vt = new Variables_Test();
		System.out.println("URL is :" + vt.strURL);
		System.out.println("New URL is :" + strURL1);
		

	}

}
