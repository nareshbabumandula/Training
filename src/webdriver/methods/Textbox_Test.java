package webdriver.methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Textbox_Test 
{
  WebDriver driver;
  @Test
  public void verifyTextBox() 
  {
	  WebElement txtUsername = driver.findElement(By.name("userName"));
	  //Enter a value in a Textbox
	  txtUsername.sendKeys("naresh");
	  String sText = txtUsername.getAttribute("value");
	  String sType = txtUsername.getAttribute("type");
	  String sSize = txtUsername.getAttribute("size");
	  String sName = txtUsername.getAttribute("name");
	  
	  System.out.println("Text found in the username field is:"+sText);
	  System.out.println("Type of username field is:"+sType);
	  System.out.println("Name of username field is:"+sName);
	  System.out.println("Size of username field is:"+sSize);
	  System.out.println("Username field display status is: "+ txtUsername.isDisplayed());
	  System.out.println("Username field enable status is: "+ txtUsername.isEnabled());
  }
    
  @BeforeClass
  public void beforeClass() 
  {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
