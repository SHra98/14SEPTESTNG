package ASSERTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion2 {
	
	WebDriver driver;
	
	@BeforeMethod
	@SuppressWarnings("deprecation")
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void VerifyPageTitle()
	{
		WebElement Username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		Assert.assertTrue(Username.isDisplayed(),"Assertion failed: Username field is not displayed");
		Username.sendKeys("Admin");
		Assert.assertTrue(password.isDisplayed(),"Assertion failed : password field is not displayed");
		password.sendKeys("admin123");
		String ExpTitle="OrangeHRM1";
		driver.findElement(By.xpath("")).click();
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, ExpTitle,"Assertion failed : Webpage title does not match expected title");
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
