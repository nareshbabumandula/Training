package webdriver.methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Checkbox_Test 
{
  WebDriver driver;
  @Test
  public void verifyCheckbox() 
  {
	  WebElement chkIndianArmed = driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
	  //Select the checkbox
	  chkIndianArmed.click();
	  String sType = chkIndianArmed.getAttribute("type");
	  String sName = chkIndianArmed.getAttribute("name");

	  System.out.println("Indian Armed checkbox type attriibute value is:"+sType);
	  System.out.println("Indian Armed checkbox name attribute value is:"+sName);
	  System.out.println("Indian Armed checkbox field display status is: "+ chkIndianArmed.isDisplayed());
	  System.out.println("Indian Armed checkbox field enable status is: "+ chkIndianArmed.isEnabled());
	  System.out.println("Indian Armed checkbox selection status is: "+ chkIndianArmed.isSelected());
	  //Select the checkbox
	  chkIndianArmed.click();
	  System.out.println("Indian Armed checkbox selection status is: "+ chkIndianArmed.isSelected());
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
