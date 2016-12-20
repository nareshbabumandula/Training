package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	 static WebDriver driver;
	public static WebDriver startBrowser(String browser, String URL)
	{
		if (browser.equalsIgnoreCase("ie")) 
		{
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Docs\\Selenium_Java\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	
}
