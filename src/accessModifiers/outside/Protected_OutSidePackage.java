package accessModifiers.outside;

import accessModifiers.test.Protected_Test;

public class Protected_OutSidePackage extends Protected_Test{

	public static void main(String[] args) {
		Protected_OutSidePackage pt1 = new Protected_OutSidePackage();
		System.out.println("The value of public variable a outside the package is:"+pt1.a);
		pt1.accessSite();
	
	}

}
