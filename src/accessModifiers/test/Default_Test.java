package accessModifiers.test;

public class Default_Test {

	
	//default access modifier for a variable
	int a =100;
	
	//default access modifier for a method
	void accessSite()
	{
		System.out.println("Successfully accessed the site");
	}
	
	
	public static void main(String[] args)
	{
		Default_Test pt = new Default_Test();
		System.out.println("The value of default variable a within the class is:"+pt.a);
		pt.accessSite();
		
	}

}
