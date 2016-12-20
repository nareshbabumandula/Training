package collections;

import java.util.ArrayList;

public class List_NoData_Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("selenium");
		al.add(786);
		al.add(false);
		al.add(10.5);
		al.add('r');
		System.out.println("Length of array list : "+al.size());
		//get 2nd value
		System.out.println("2nd value from list is : "+al.get(1));
		
		

	}

}
