package Stepdef;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstClass extends Base {
	Base base;
	WebDriver driver;
	LoginPage lp;
	@Given("Enter the Facebook URL")
	public void enter_the_facebook_url() {
		base =new Base();
		 
	    driver = base.launchBrowser();
	    base.openURL("https://www.facebook.com/");
	    lp=new LoginPage(driver);
	}

	@When("enter the username and password")
	public void enter_the_username_and_password() {
		base.send(lp.getUsername(), "thillai");
	   base.send(lp.getPassword(), "arasu");
	 
		
	}

	@Then("validate the login")
	public void validate_the_login() {
		  base.buttonclick(lp.getLoginButton());
	}

}
