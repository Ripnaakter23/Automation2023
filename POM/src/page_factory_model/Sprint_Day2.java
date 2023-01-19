package page_factory_model;

import org.testng.annotations.Test;

import automation_practice.pom_default_class;
import pagemodel.SignInPage;

public class Sprint_Day2 extends pom_default_class {
SignInPage SignIn;	
SignUpPage SignUp;
@Test(priority=1, invocationCount=2)
public void RunSignIn() {
SignUp=new SignUpPage(driver);
SignIn= new SignInPage(driver);
SignIn.OpenSignup("Sparrow@gmail.com");
SignIn.OpenSignup("edward@gmail.com");
SignUp.FillSignUpForm("edwin", "bacon", "15", "April",10);
SignUp.FillSignUpForm("edward", "james", "14", "May",15);
}
}
