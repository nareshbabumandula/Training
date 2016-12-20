package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public void CheckedException_Demo()
	{
		try {
			FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Desktop\\Selenium_Notes.txt");
			int r;											
			while((r=strFile.read())!=-1)
			{
				System.out.println((char)r);
			}
			strFile.close();
		} 
		
		catch (Exception e)
		{
			System.out.println("Executing catch block of Exception class");
		}
			
	}
	//Checked exception - Compile time exception
	public void FileUpload()
	{
		try {
			FileInputStream strFilePath = new FileInputStream("C:\\Users\\NareshBabu\\Desktop\\Selenium_Notes.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		}
		finally
		{
			System.out.println("Executed FileUpload method");
		}
		
	}
	
	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		//ce.CheckedException_Demo();
		ce.FileUpload();
		

	}

}
