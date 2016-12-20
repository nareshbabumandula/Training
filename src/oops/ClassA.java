package oops;

public class ClassA {
	
	String Brand = "Khaitan";
	String Color = "white";
	int Price = 1500;
	static int discount=100;
	
	public void Speed()
	{
		System.out.println("Fan is rotating");
	}
			
	static void Stop()
	{
		System.out.println("Fan is stopped");
	}

	public static void main(String[] args) {
		
		ClassA c1 = new ClassA();
		System.out.println(c1.Brand);
		System.out.println(c1.Color);
		System.out.println(c1.Price);
		c1.Speed();
		Stop();
		System.out.println(discount);
	}

}
