package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;

public class verifyLogin 
{

	@Test
	public void checkValidUser()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://newtours.demoaut.com/");
		LoginPage lp =  PageFactory.initElements(driver, LoginPage.class);
		lp.login("naresh", "secure");
	}
	

}
