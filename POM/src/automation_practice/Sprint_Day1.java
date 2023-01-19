package automation_practice;

import org.testng.annotations.Test;

import pagemodel.SignInPage;

public class Sprint_Day1 extends pom_default_class {
SignInPage SignIn;	
@Test(priority=0, invocationCount=2)
public void RunSignIn() {
SignIn= new SignInPage(driver);
SignIn.OpenSignup("Sparrow@gmail.com");	
	
}
}
