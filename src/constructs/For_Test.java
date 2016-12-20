package constructs;

public class For_Test {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if(i%2==0)
			{
				System.out.println("The number " + i + " is an even number");
			}
			else
			{
				System.out.println("The number " + i + " is an odd number");
			}
		}
		
	}

}
