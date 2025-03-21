package FEATURES;

import org.testng.annotations.Test;

public class program2 {
	
	@Test(groups="Smoke")
	public void Test1()
	{
		System.out.println("program 1");
	}
	@Test(groups="Smoke")
	public void Test2()
	{
		System.out.println("program 2");
	}
	@Test(groups="Regression")
	public void Test3()
	{
		System.out.println("program 3");
	}

}
