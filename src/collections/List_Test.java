package collections;

import java.util.ArrayList;

public class List_Test {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		
		//add values to list
		l.add("UFT");
		l.add("selenium");
		l.add("ranorex");
		l.add("testcomplete");
		l.add("seetest");
		l.add("sikuli");
		l.add("autoit");
	
			
		//get number of values in arraylist
		System.out.println("Number of values are : "+l.size());
		//add values to array list
		l.add("qtp");
		l.add("testcomplete");
		l.add("loadrunner");
		System.out.println("Number of values after adding are : "+l.size());
		//remove values from list
		l.remove("testcomplete");
		System.out.println("Number of values after removing are : "+l.size());
		//print 3rd value
		System.out.println("3rd value in Array list is : "+l.get(2));
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Values in list are : "+l.get(i));
		}

	}

}
