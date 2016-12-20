package oops;

public class ClassB extends ClassA{

	public void Stock()
	{
		System.out.println("Stock is available");
	}
	
	public void ProductType()
	{
		System.out.println("Electrical product");
	}
	
	public static void main(String[] args) {

		ClassB cb = new ClassB();
		cb.Stock();
		cb.ProductType();
		cb.Speed();
		cb.Stop();
		System.out.println(cb.Brand);
		System.out.println(cb.Color);
		System.out.println(cb.Price);

	}

}
