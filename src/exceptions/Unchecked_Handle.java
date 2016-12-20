package exceptions;

public class Unchecked_Handle {

	public static void main(String[] args) {
		try {
			int i=85;
			int j=i/5;
			System.out.println("J value is : "+j);
		} catch (ArithmeticException e) {
			System.out.println("There is an exception --Divided by Zero. Please give another number");
		}
		

	}

}
