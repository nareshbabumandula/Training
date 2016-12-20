package webdriver.methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class RadioButton_Test 
{
  WebDriver driver;
  @Test
  public void verifyRadioButton() 
  {
	  WebElement rbtnOneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
	  //Select the radio button
	  rbtnOneWay.click();
	  String sValue = rbtnOneWay.getAttribute("value");
	  String sType = rbtnOneWay.getAttribute("type");

	  System.out.println("Type value attribute value Oneway radio button is:"+sValue);
	  System.out.println("Oneway radio button type attribute value is:"+sType);
	  System.out.println("Oneway radio button display status is: "+ rbtnOneWay.isDisplayed());
	  System.out.println("Oneway radio button enable status is: "+ rbtnOneWay.isEnabled());
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
