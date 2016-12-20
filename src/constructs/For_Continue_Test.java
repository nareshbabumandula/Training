package constructs;

public class For_Continue_Test {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) 
		{
			System.out.println("Iteration is:"+i);
			if(i%2==0)
				continue;
				System.out.println(" ");
			}
		
	}

}
