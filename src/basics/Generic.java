package basics;

public class Generic 
{
		
	public Generic(String strUsername)
	{
		System.out.println("Executing the parametrized constructor with username :"+strUsername);
	}
	
	public Generic(String strUsername, String strPassword)
	{
		System.out.println("Username is:"+strUsername);
		System.out.println("Password is:"+strPassword);
	}
		
	public Generic()
	{
		System.out.println("Executing the constructor");
	}
	
	public void login()
	{
		System.out.println("Executed login method");
	}
	
	public static void main(String[] args)
	{
		Generic g1 = new Generic();
		Generic g2 = new Generic("naresh223");
		Generic g3 = new Generic("naresh223","Secure*12");
		
		
	}

}
