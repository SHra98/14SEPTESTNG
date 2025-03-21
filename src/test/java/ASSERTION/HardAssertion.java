package ASSERTION;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void Test1()
	{
		System.out.println("Program started");
		boolean actualresult=false;
		Assert.assertTrue(actualresult,"Assertion failed : value should be true");
		System.out.println("program complete");
	}
	@Test
	public void Test2()
	{
		System.out.println("Program started");
		boolean actualResult=false;
		Assert.assertFalse(actualResult,"Assertion failed : value should be true");
		System.out.println("program complete");
	}
	@Test
	public void Test3()
	{
		System.out.println("program started");
		String s1="Java";
		String s2="Java";
		String s3="Python";
		Assert.assertEquals(s1, s2,"Assert Equal failed : Expected Java but found 'Python'");
		Assert.assertEquals(s1, s3,"Assert Equal failed : Expected Java but found 'Python'");
		System.out.println("Program completed");
	}
	@Test
	public void Test4()
	{
		System.out.println("program started");
		String s1="Java";
		String s2="Java";
		String s3="Python";
		Assert.assertNotEquals(s1, s3,"Assert Equal failed : Expected Java but not found python");
		Assert.assertNotEquals(s1, s3,"Assert Equal failed : Expected Java but not found python");
		System.out.println("Program complete");
	}

	//doubt
}
