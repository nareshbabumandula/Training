package webdriver.methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Mouseover_Test 
{
  WebDriver driver;
  @Test
  public void verifyMouseOver() 
  {
	  WebElement lnkInvestors = driver.findElement(By.linkText("Investors"));
	 
	  Actions menu = new Actions(driver);
	  menu.moveToElement(lnkInvestors).perform();
	  WebElement lnkCorporate = driver.findElement(By.xpath("//a[contains(.,'Corporate Governance  ')]"));
	  menu.moveToElement(lnkCorporate).perform();
	  menu.click(lnkCorporate).perform();
	  
	  
  }
    
  @BeforeClass
  public void beforeClass() 
  {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.spicejet.com/");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  //driver.quit();
  }

}
