package FEATURES;

import org.testng.annotations.Test;

public class Dependsonmethods {
	
	@Test
	public void LogInTest()
	{
		System.out.println("test case start");
		System.out.println(10/2);
	}
	@Test(dependsOnMethods="LogInTest")
	public void homepage()
	{
		System.out.println("homepage test");
	}
	@Test(dependsOnMethods="LogInTest")
	public void createNewAccount()
	{
		System.out.println("create new account test");
	}
	@Test(dependsOnMethods="LogInTest")
	public void RefreshTest()
	{
		System.out.println("Refresh Test");
	}

}
