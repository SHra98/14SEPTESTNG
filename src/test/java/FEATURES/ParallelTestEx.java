package FEATURES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestEx {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void TestMethod1()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void TestMethod2()
	{
		System.out.println("https://www.orangehrm.com/");
	}
	@Test
	public void TestMethod3()
	{
		System.out.println("https://demo.automationtesting.in/Register.html");
	}
	@Test
	public void TestMethod4()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@BeforeClass
	public void Teardonw() 
	{ 
	  driver.quit(); 
	}
}
