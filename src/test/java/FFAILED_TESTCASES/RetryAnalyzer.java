package FFAILED_TESTCASES;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int retrycount=0;
	int maxRetryCount=3;
	
	public boolean retry(ITestResult result)
	{
		if(retrycount<maxRetryCount)
		{
			retrycount++;
        System.out.println("Retrying test" +result.getName()+"for the"+retrycount+"time");
         return true;
		}
		return false;
		
	}

}
