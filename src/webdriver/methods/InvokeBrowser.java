package webdriver.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InvokeBrowser {
	WebDriver driver;
	
	/**@author NareshBabu
	 * @Description This method is used to launch a browser and navigate to the URL provided	
	 * @param strBrower
	 * @param strURL
	 */
	public void LaunchBrowser(String strBrower, String strURL)
	{
		if (strBrower.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", "G:\\JAR's\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (strBrower.equalsIgnoreCase("firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver", "G:\\JAR's\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (strBrower.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "G:\\JAR's\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (strBrower.equalsIgnoreCase("safari")) 
		{
			System.setProperty("webdriver.safari.driver", "G:\\JAR's\\safaridriver.exe");
			driver = new SafariDriver();
		}
		//Maximize the browser window
		driver.manage().window().maximize();
		//Navigate to the URL
		driver.get(strURL);
		//Get the page title
		System.out.println("Page title is:"+driver.getTitle());
		//Click on Register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Get the current page URL
		System.out.println(driver.getCurrentUrl());
		//Navigate back in browser window
		driver.navigate().back();
		//Navigate forward in browser window
		driver.navigate().forward();
		//Refresh the browser 
		driver.navigate().refresh();
		//Get the browser window id
		System.out.println("Window ID is:"+driver.getWindowHandle());
		//Get the page source
		System.out.println("Page source is:"+driver.getPageSource());
		//Close the webdriver browser
		driver.quit();
	}
	
	
	public static void main(String[] args)
	{
		InvokeBrowser ib = new InvokeBrowser();
		ib.LaunchBrowser("ie", "http://www.newtours.demoaut.com/");

	}

}
