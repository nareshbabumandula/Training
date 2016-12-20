package exceptions;

public class Multile_Catch {

	public static void main(String[] args) {
		try {
			String x[]={"test","hello"};
			System.out.println(x[1]);
			
			String y=null;
			System.out.println(y.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered number exceeds the limit. give less number");
		}
		
		catch (NullPointerException e) {
			System.out.println("String is Null enter something");
		}
		

	}

}
