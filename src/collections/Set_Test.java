package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Test {

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<String>();
		s.add("jmeter");
		s.add("loadrunner");
		s.add("go");
		s.add("jenkins");
		s.add("jenkins");
		System.out.println("NUmber of values in Set : "+s.size());
		//add elements
		s.add("manual testing");
		s.add("manual testing");
		System.out.println("NUmber of values in Set after ading: "+s.size());
		//delete values from set
		s.remove("go");
		System.out.println("NUmber of values in Set after removing: "+s.size());
		//Get the first value from the hashset s
		System.out.println("First value in hashset s is:"+s.iterator().next());
		
		/*for (int i = 0; i < args.length; i++) {
			
		}*/
	
		for (String value : s) {
			
			System.out.println("Values in Set are : "+value);
		}
		
		Iterator it = s.iterator();
		while (it.hasNext()) {
	
			System.out.println("Value of hashset is:"+it.next());
		}

	}

}
