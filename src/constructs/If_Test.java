package constructs;

public class If_Test {

	public static void main(String[] args) {
		
		 int month =4;
		 
		 if (month==1 || month==2 || month==3) {
			System.out.println("This is a winter season");
		 }
		 else if(month==4 || month==5 || month==6)
		 {
			 System.out.println("This is a summer season"); 
		 }
		 else if(month==7 || month==8 || month==9)
		 {
			 System.out.println("This is a rainy season"); 
		 }
		 else if(month==10 || month==11 || month==12)
		 {
			 System.out.println("This is a autumn season"); 
		 }
		 else
		 {
			 System.out.println("Invalid month");
		 }
		 
		 
	}

}
