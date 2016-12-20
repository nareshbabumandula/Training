package pagefactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	WebDriver driver; 
	
	
	public LoginPage(WebDriver ldriver)
	{	
		this.driver = ldriver;
	}
	
	@FindBy(name="userName")
	@CacheLookup
	static WebElement txtUsername;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	static WebElement txtPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	@CacheLookup
	WebElement btnSignIn;
	
	public void login(String strUsername, String strPassword)
	{
		txtUsername.sendKeys(strUsername);
		txtPassword.sendKeys(strPassword);
	}
	

}