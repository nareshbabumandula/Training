package oops;

public class Polymorphism_Overloading extends Polymorphism_Overriding{
	
	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of integers a and b is:"+c);
	}

		
	public void addition(double a, double b)
	{
		double c = a+b;
		System.out.println("Addition of double values of a and b is:"+c);
	}
	
	public void test()
	{
		super.addition(10, 20);
		this.addition(12, 12);
	}
	
	
		
	public static void main(String args[])
	{
		Polymorphism_Overloading po = new Polymorphism_Overloading();
		//po.addition(10,40);
		//po.addition(23.34543, 45.34566);
		//po.multiplication(30, 20);
		po.test();
		
	}


}
