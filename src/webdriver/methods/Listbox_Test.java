package webdriver.methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Listbox_Test 
{
  WebDriver driver;
  @Test
  public void verifySelect() 
  {
	WebElement lstCountry = driver.findElement(By.name("country"));
	Select dropdown = new Select(lstCountry);
	dropdown.selectByVisibleText("INDIA");
	dropdown.selectByIndex(1);

	List<WebElement> allOptions = lstCountry.findElements(By.tagName("option"));
	for (WebElement option : allOptions) {
	    System.out.println("Value found is:"+ option.getAttribute("text"));
	}

  }
    
  @BeforeClass
  public void beforeClass() 
  {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
  }

  @AfterClass
  public void afterClass() 
  {
	  //driver.quit();
  }

}
