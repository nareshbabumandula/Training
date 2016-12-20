package accessModifiers.test;

public class Default_OutSideClass {

	public static void main(String[] args) {
		Default_Test pt1 = new Default_Test();
		System.out.println("The value of default variable a outside the class is:"+pt1.a);
		pt1.accessSite();
		
		
		
	}

}
