package exceptions;

public class Finally_Program {

	public static void main(String[] args) {
		try {
			System.out.println("Open DB Connection");
			System.out.println("Perform actions");
			String s = "testing";
			System.out.println(s.length());
			
		} catch (Exception e) {
			System.out.println("Exception in Try block");
		}
		finally {
			System.out.println("Close Connection");
		}

	}

}
