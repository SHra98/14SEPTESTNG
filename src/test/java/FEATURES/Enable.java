package FEATURES;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enable {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://www.facebook.com/"); 
	}
	// Test case 1 - Verify that the email input field is displayed
	@Test(enabled=true)
	public void VerifyEmailInputField()
	{
		boolean emaildisplayed=driver.findElement(By.id("email")).isDisplayed();
		System.out.println(emaildisplayed);
	}
	@Test(enabled=true)
	public void VerifyPassInputField()
	{
		boolean PassDisplayed=driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(PassDisplayed);
	}
	@Test(enabled=true)
	public void verifyLogin()
	{
		boolean login=driver.findElement(By.id("login")).isDisplayed();
		System.out.println(login);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
