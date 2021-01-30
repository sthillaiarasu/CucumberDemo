package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepdef.Base;

public class LoginPage extends Base {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(id = "u_0_b")
	private WebElement loginButton;

}
