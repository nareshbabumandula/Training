package constructs;

public class Switch_Test {

	public static void main(String[] args) {
		
		String strMonth = "febr";
		
		switch (strMonth) {
		case "jan": case "janu": case "janua":
			System.out.println("This is January");
			break;
		case "feb":
		case "febr":
		case "febru":
			System.out.println("This is February");
			break;
		case "mar":
			System.out.println("This is March");
			break;
		case "apr":
			System.out.println("This is April");
			break;
		case "may":
			System.out.println("This is May");
			break;
		case "jun":
			System.out.println("This is June");
			break;
		case "jul":
			System.out.println("This is July");
			break;
		case "aug":
			System.out.println("This is August");
			break;
		case "sep":
			System.out.println("This is September");
			break;
		case "oct":
			System.out.println("This is October");
			break;
		case "nov":
			System.out.println("This is November");
			break;
		case "dec":
			System.out.println("This is December");
			break;

		default:
			System.out.println("Invalid month");
			break;
		}

		
	}

}
