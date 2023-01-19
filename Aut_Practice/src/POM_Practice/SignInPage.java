package POM_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	WebDriver driver;
By SignIn= By.xpath("//a[@class='login']");
By EmailAddress = By.cssSelector("input#email_create");
By CreateAccount= By.xpath("//*[@id=\"SubmitCreate\"]");

public SignInPage (WebDriver driver) {
	this.driver=driver;
	
}
public void signin() {
driver.findElement(SignIn).click();
}
public void email(String email) {
driver.findElement(EmailAddress).sendKeys(email);
}
public void createaccount() {
	driver.findElement(CreateAccount).click();
}

public void OpenSignUp(String email) {
this.signin();
this.email(email);
this.createaccount();
}
}
