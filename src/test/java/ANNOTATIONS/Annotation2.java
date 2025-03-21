package ANNOTATIONS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation2 {
	
	// BeforeSuite ,BeforeTest, Beforeclass, BeforeMethod,@Test , @AfterMethod,
	// @AfterClass, @AfterTest , @AfterSuite
	
	WebDriver driver;
	@SuppressWarnings("deprecation") 
	// Set up the webdriver and initialize browser each test
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	}
	@Test
	private void At()
	{ 
	  String Title = driver.getTitle(); 
	  System.out.println("Page title " + Title); 
	  System.out.println("Test case verify page title"); 
	} 
	@Test
	public void verifyLogoPresence()
	{
		boolean IsLogoDisplay=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("Is logo display" +IsLogoDisplay);
		System.out.println("Test case :Verify logo presence");
	}
	@Test(enabled=true)
	public void demo()
	{
		boolean islogodisplayed = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed(); 
		System.out.println("Is logo dispalyed " + islogodisplayed); 
		System.out.println("Test case :Demo"); 
	}
	@AfterMethod
	public void TearDown() 
	{ 
	   driver.quit(); // Close the browser
	}

}
