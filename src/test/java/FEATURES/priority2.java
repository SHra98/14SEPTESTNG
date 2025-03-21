package FEATURES;

import org.testng.annotations.Test;

public class priority2 {
	
	@Test(priority=1)
	public void LoginTest()
	{
		System.out.println("executing login test");
	}
	@Test(priority=1)
	public void dashboardTest()
	{
		System.out.println("executing dashboard test");
	}
	@Test(priority=-1)
	public void logoutTest()
	{
		System.out.println("Executing logout test");
	}
	@Test
	public void logoutTest1()
	{
		System.out.println("executing without priority test");
	}

}
