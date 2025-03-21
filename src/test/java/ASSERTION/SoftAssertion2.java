package ASSERTION;

import org.testng.asserts.SoftAssert;

public class SoftAssertion2 {
	
	public void TestForSoftAssertion()
	{
		SoftAssert Assert=new SoftAssert();
		System.out.println("Step 1 : Veify first condition");
		Assert.assertEquals(10,50, "First assertion failed");
		System.out.println("Step 2 : Veify second condition");
		Assert.assertTrue(10>50, "Second assertion failed");
		System.out.println("Step 3 : Verify third condition");
		Assert.assertFalse("Java".isEmpty(),"Third assertion failed");
		System.out.println("Step 4 : Containing test execution after failure");
		Assert.assertAll();
	}

}
