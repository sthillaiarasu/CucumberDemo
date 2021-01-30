package Stepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	WebDriver driver;
	
	public WebDriver launchBrowser()  {
		
		String browser = readProperties("browser");
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\thill\\eclipse-workspace\\Thillai\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\thill\\eclipse-workspace\\Thillai\\chromedriver_win32\\chromedriver.exe");
		 driver=new FirefoxDriver();
		}
	 
	 return driver;
		
	}
	
	public void openURL(String URL)
	{
		driver.get(URL);
		driver.findElement(By.cssSelector(""));
	}
	
	
	public void send(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public void buttonclick(WebElement element)
	{
		element.click();
	}

	public String readProperties(String key) 
	{
		FileInputStream fis = null;
		String property = null;
		try {
			fis = new FileInputStream("C:\\Users\\thill\\eclipse-workspace\\Ccucumber\\config.properties");
			Properties pro=new Properties();
			pro.load(fis);
			 property = pro.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return property;
			}
	
	public void waitIM()
	{
		String readProperties = readProperties("wait");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(readProperties), TimeUnit.SECONDS);
	}
}
