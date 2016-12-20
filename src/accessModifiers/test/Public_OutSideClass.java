package accessModifiers.test;

public class Public_OutSideClass {

	public static void main(String[] args) {
		Public_Test pt1 = new Public_Test();
		System.out.println("The value of public variable a outside the class is:"+pt1.a);
		pt1.accessSite();
	}

}
