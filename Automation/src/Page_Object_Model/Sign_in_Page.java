package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sign_in_Page {
	WebDriver Driver;
	By PageTitle= By.tagName("title");
	By Login= By.className("login");
	By CreateaccountForm= By.cssSelector("#create-account_form");


	public Sign_in_Page(WebDriver Driver) {
	this.Driver= Driver;
	}
	public String MainpageTitle() {
	return Driver.getTitle();

	}

	public void Login() {
	Driver.findElement(Login).click();
	}

	public String LoginpageTitle() {
	return Driver.getTitle();
	}

	public void VerifysignupForm() {
	String actualForm= Driver.findElement(CreateaccountForm).getAttribute("id");
	String expectedForm= "create-account_form";
	Assert.assertEquals(actualForm, expectedForm);
	System.out.println("What is the form id?" +actualForm);
	}

	public void OpenloginPage() {
	this.MainpageTitle();
	System.out.println("What's the Main Page Title?" + Driver.getTitle());
	this.Login();
	this.LoginpageTitle();
	System.out.println("What's the Login Page Title?" +Driver.getTitle());
	this.VerifysignupForm();
	}
}
