package ANNOTATIONS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Executuon sequence of annotations
//@BeforeSuite setup system confign
//@BeofreTest -- Login Application
//@BeforeClass -- Enter URL
//@BeofreMethod -- Launch Browser
//Facebook 1 logo verify
//@AfteMethod -- DeleteCookies
//@BeofreMethod -- Launch Browser
//Facebook 2 logo verify
//@AfteMethod -- DeleteCookies
//@beforeMethod 
//Demo
//AfterMethod 
//Afterclass -- Close browser
//@AfterTest -- FacebookLogout
//@AfterSuite -
//in real time project we don't need all these annotations we use 
 //@beforemethod, @AfterMethod
//@Test, @BeforeClass, Afterclass

public class Annotation1 {
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("@Beforesuite setup system config");
	}
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("@BeforeMethod - Launch Browser");
	}
	@BeforeTest
	public void LoginApp()
	{
		System.out.println("@BeforeTest - Login application");
	}
	@BeforeClass
	public void name()
	{
		System.out.println("@BeforeClass -- Enter URL");
	}
	@Test
	public void demo()
	{
		int i=10/1;
		System.out.println(i);
		System.out.println("demo");
	}
	@Test
	public void FacebookLogoTest1()
	{
		System.out.println("Facebook 1 logo verify");
	}
	@Test
	public void FacebookLogoTest2()
	{
		System.out.println("Facebook 2 logo verify");
	}
	@AfterMethod
	public void deletecookies()
	{
		System.out.println("@AfterMethod - delete cookies");
	}
	@AfterTest
	public void FacebookLogout()
	{
		System.out.println("@AfterTest - facebookLogout");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("@Afterclass - Close Browser");
	}
	@AfterSuite
	public void logout()
	{
		System.out.println("@Aftersuite - system setup config");
	}

}
