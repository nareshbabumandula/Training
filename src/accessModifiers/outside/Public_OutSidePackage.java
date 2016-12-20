package accessModifiers.outside;
import accessModifiers.test.Public_Test;


public class Public_OutSidePackage{

	public static void main(String[] args) {
		Public_Test pt1 = new Public_Test();
		System.out.println("The value of public variable a outside the package is:"+pt1.a);
		pt1.accessSite();
		
		
		
	}

}
