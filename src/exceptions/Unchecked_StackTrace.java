package exceptions;

public class Unchecked_StackTrace {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());	
		} catch (Exception e) {
			System.out.println("Enter some string");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
