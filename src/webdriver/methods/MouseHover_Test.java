package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Test 
{
  public WebDriver driver;
	
  @Test
  public void MenuNavigation() throws InterruptedException 
  {
	  WebElement lnkInvestors = driver.findElement(By.linkText("Investors"));
	  Actions menu = new Actions(driver);
	  menu.moveToElement(lnkInvestors).perform();
	  Thread.sleep(1000);
	  WebElement lnkCorporateGovernance = driver.findElement(By.xpath("//a[contains(.,'Corporate Governance  ')]"));
	  menu.moveToElement(lnkCorporateGovernance).perform();
	  Thread.sleep(1000);
	  WebElement lnkCorporate = driver.findElement(By.linkText("Corporate Governance"));
	  lnkCorporate.click();
	  System.out.println(driver.getTitle());
  }
  
  @BeforeClass
  public void AccessSite() 
  {
	  //System.setProperty("webdriver.chrome.driver", "G:\\JAR's\\chromedriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() 
  {
  }

}
