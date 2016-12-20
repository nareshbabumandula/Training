package accessModifiers.test;

public class Protected_OutSideClass {

	public static void main(String[] args) {
		Protected_Test pt1 = new Protected_Test();
		System.out.println("The value of protected variable a outdside the class is:"+pt1.a);
		pt1.accessSite();
		
		
		
	}

}
