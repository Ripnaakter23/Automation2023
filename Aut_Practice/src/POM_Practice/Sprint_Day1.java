package POM_Practice;

import org.testng.annotations.Test;
import POM_Practice.SignInPage;
public class Sprint_Day1 extends POM_default_class {
SignInPage SignIn;	
@Test(priority=0, invocationCount=10)
public void RunSignIn() {
SignIn= new SignInPage(driver);	
SignIn.OpenSignUp("robert@yahoo.com");
}
}
