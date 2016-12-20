package collections;

import java.util.HashMap;

public class Map_Test {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(4, "loadtesting");
		hm.put(3, "security");
		hm.put(9, "performance");
		hm.put(45, "test");
		hm.put(10, "uft");

		System.out.println("Number of values in HashMap are : "+hm.size());
		hm.put(8, "new");
		hm.put(15, "old");
		System.out.println("Number of values in HashMap are after adding: "+hm.size());
		hm.put(15, "hello");
		System.out.println("Number of values in HashMap are after adding: "+hm.size());
		//remove value from Hash map
		hm.remove(9);
		System.out.println("Number of values in HashMap are after deleting: "+hm.size());
		System.out.println(hm.get(45));
	}

}
