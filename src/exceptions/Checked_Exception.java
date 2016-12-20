package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\java.txt");
		FileReader fr = new FileReader(f);

	}

}
