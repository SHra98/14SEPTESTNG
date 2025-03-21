package FFAILED_TESTCASES;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void TestMethod1()
	{
		System.out.println("exciting test method1");
		Assert.assertTrue(false,"Failed in testmethod 1");
	}
	public void TestMethod2()
	{
		System.out.println("exciting test method2");
		Assert.assertTrue(true,"Failed in testmethod 1");
	}

}
