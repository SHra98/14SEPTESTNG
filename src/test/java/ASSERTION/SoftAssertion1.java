package ASSERTION;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
	
	@Test
	public void Test1()
	{
		System.out.println("Program started");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(true);
		System.out.println("Program completed");
		//Collect all result and report failure at end
		sa.assertAll();
	}
	@Test
	public void Test2()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("program started");
		sa.assertEquals("Java", "Java");
		System.out.println("Program completed");
		sa.assertAll();
	}

}
