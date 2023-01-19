package TestNGPractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest 
{
Boolean datasetup= true;	
@Test(enabled=false)	
public void skipTest1()
{
System.out.println("Skipping this test as it's not complete");	
	
}
@Test
public void skipTest2() 
{
System.out.println("Skipping this test as it's not complete");	
throw new SkipException("skipping this test");	
}
@Test
public void skipTest3() 
{
	
System.out.println("Skipping this test as it's not complete");
if(datasetup==true)
{
System.out.println("Execute thge test");	
}
else
{
System.out.println("Do not execute further steps");	
throw new SkipException("Do not execute further steps");

}
}


}