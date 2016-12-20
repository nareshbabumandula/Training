package oops;

public class Common extends Abstract_Test{

		
	public static void main(String[] args) {
		Common c = new Common();
		c.AccessSite();
		c.Login();
		c.Logout();
	}

	public void AccessSite()
	{
		System.out.println("Successfully accessed the site");
	}
	
	public void Login()
	{
		System.out.println("Login Successful");
	}

	
}
