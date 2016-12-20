package accessModifiers.test;

public class Public_Test {

	
	//public access modifier for a variable
	public int a =100;
	
	//public access modifier for a method
	public void accessSite()
	{
		System.out.println("Successfully accessed the site");
	}
	
	
	public static void main(String[] args)
	{
		Public_Test pt = new Public_Test();
		System.out.println("The value of public variable a within the class is:"+pt.a);
		pt.accessSite();
		
	}

}
