package oops;

public class Polymorphism_Overriding {
	
	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of integers a and b  in super class method is:"+c);
	}

		
	public void addition(double a, double b)
	{
		double c = a+b;
		System.out.println("Addition of double values of a and b in super class method is:"+c);
	}
	
	
	public void multiplication(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication of integer values of a and b in super class method is:"+c);
	}
	


}
