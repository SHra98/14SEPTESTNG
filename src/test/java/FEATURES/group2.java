package FEATURES;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class group2 {
	
	@Test(groups= {"Login","Smoke"})
	public void TestUserLogin()
	{
		System.out.println("Login test case");
	}
	@Test(groups= {"search","Regression"})
	public void productSearch()
	{
		System.out.println("product search case");
	}
	@Test(groups = { "cart", "Regression" }) 
	public void addcart() { 
	System.out.println("add cart test case"); 
	} 
	@Test(groups = { "checkout", "Regression" }) 
	public void checkoutprocesss() { 
	System.out.println("checkoutprocesss test case"); 
	} 

}
