package FEATURES;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount=10,enabled=true,priority=1)
	public void name()
	{
		System.out.println("automation");
	}

}
