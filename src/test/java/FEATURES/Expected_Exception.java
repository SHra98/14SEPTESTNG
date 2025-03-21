package FEATURES;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test()
	{
		System.out.println("hello");
		System.out.println(10/0);
	}
}
