package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebDriver driver;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login_button()
	{
		return login;
	}
	
 public	Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
