package accessModifiers.test;

public class Private_Test {

	
	//private access modifier for a variable
	private int a =100;
	
	//private access modifier for a method
	private void accessSite()
	{
		System.out.println("Successfully accessed the site");
	}
	
	
	public static void main(String[] args)
	{
		Private_Test pt = new Private_Test();
		System.out.println("The value of private variable a within the class is:"+pt.a);
		pt.accessSite();
		
	}

}
