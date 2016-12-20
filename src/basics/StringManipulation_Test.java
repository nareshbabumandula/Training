package basics;

public class StringManipulation_Test {

	public static void main(String[] args) {
		
		String sText1 = "hello world";
		String sText2  = "HELLO WORLD";
		String sText3  = "Hello world this is java";
		String sText4  = "                                       welcome to java training                                              ";
				

		//Concatination + or concat 
		System.out.println( "care".concat("less"));
		//IsEmpty
		System.out.println("String sText1 empty status is:"+sText1.isEmpty());
		//Contains a substring
		System.out.println("Contains string status is:"+sText3.contains("java"));
		//Length of a string
		System.out.println("Length of the String sText1 is:"+sText1.length());
		//Convert the String from lowercase to uppercase
		System.out.println(sText1.toUpperCase());
		//Convert the String from uppercase to lowercase
		System.out.println(sText2.toLowerCase());
		//Find the index position of the char in string
		System.out.println(sText3.charAt(6));
		//Trim or cut the space
		System.out.println(sText4.trim());
		//Compare two strings
		System.out.println(sText1.equalsIgnoreCase(sText2));
		//Get the substring from main string
		System.out.println(sText3.substring(6, 11));
		//Char at Index 
		System.out.println(sText1.indexOf("e"));
		//Starts with prefix - boolean true/false
		System.out.println("String stText1 starts with status is:"+sText1.startsWith("hello"));
		//Starts with prefix - boolean true/false
		System.out.println("String stText1 ends with status is:"+sText1.endsWith("world"));
		
		String asText[] = sText3.split(" ");
		//Length of an array
		System.out.println("Length of the array asText is:"+asText.length);
		//Print the first element of the splitted expression
		for (int i = 0; i < asText.length; i++) {
			System.out.println("Element of an array is:"+asText[i]);
		}
		//Replace the String with a new string
		System.out.println(sText3.replace("java", "core java"));
		
	
		for (int i = 0; i < 100; i++) {
			System.out.println("Iteration value is:"+i);
		}
	
	
	
	
	}
	
	
	
	
}
