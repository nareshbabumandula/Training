package exceptions;

public class UnCheckedException {

	public void Arithmatic()
	{
		int x=10;
		int y = 0;
		int z = x/y;
		System.out.println("The value of z is:"+z);
	}
	
	
	public void Array_Test()
	{
		try 
		{
			int marks[] = {10,20,70,80,90};
			System.out.println("Length of the array is:"+marks.length);
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[2]);
			System.out.println(marks[3]);
			System.out.println(marks[4]);
			System.out.println(marks[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
			System.out.println("Array index is not found");
		}
	}
		
	public void NullException()
	{
		try {
			String sText = null;
			System.out.println(sText.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("String does not contain any data");
		}
	}
	
	/**
	 * Description: This method is used to convert the given data into an integer
	 * Author: Naresh
	 * Date: 08-Dec-2016
	 */
	public void NumberFormatException()
	{
		try {
			String sText = "java123";
			int data = Integer.parseInt(sText);
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to convert");
		}
	}
	public static void main(String[] args) {
		UnCheckedException uc = new UnCheckedException();
		//uc.Arithmatic();
		//uc.Array_Test();
		//uc.NullException();
		uc.NumberFormatException();

	}

}
