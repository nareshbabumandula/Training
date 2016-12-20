package accessModifiers.test;

public class Protected_Test {

	//protected access modifier for a variable
	protected int a =100;
	
	//protected access modifier for a method
	protected void accessSite()
	{
		System.out.println("Successfully accessed the site");
	}
	
	
	public static void main(String[] args)
	{
		Protected_Test pt = new Protected_Test();
		System.out.println("The value of protected variable a within the class is:"+pt.a);
		pt.accessSite();
		
	}

}
