package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sign_In_PageFactory {
WebDriver Driver;
@FindBy(tagName="pageTitle")
WebElement title;
@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
WebElement Create_Account;

@FindBy(xpath="//input[@name='firstname']")
WebElement FirstName;

@FindBy(xpath="//input[@name='lastname']")
WebElement LastName;

@FindBy(xpath="//input[contains(@name,'reg_email__')]")
WebElement Email;

@FindBy(xpath="//input[starts-with(@autocomplete, 'new-pass')]")
WebElement Password;

@FindBy(xpath="//select[@name='birthday_month'][@id='month']")
WebElement Month;

@FindBy(xpath="//select[@id='day']")
WebElement Day;

@FindBy(xpath="//select[@id='year']")
WebElement Year;

@FindBy(xpath="//input[@value='2']")
WebElement Male;

@FindBy(xpath="//input[@value='1']")
WebElement Female;

public Sign_In_PageFactory(WebDriver Driver) {
	this.Driver=Driver;
PageFactory.initElements(Driver, this);	
}
public String MainPageTitle() {
	String title=Driver.getTitle();
	System.out.println(title);
	return title;
}
public void login() {
	Create_Account.click();
}	
public void FirstName(String Fname){
	FirstName.sendKeys(Fname);
}

public void LastName(String Lname){
	LastName.sendKeys(Lname);
}
public void Email(String email) {
	Email.sendKeys(email);
}

public void Paasword(String password) {
	Password.sendKeys(password);	
}
public void Birth_Month(int month) {
	Select Sinput= new Select(Month);
	Sinput.selectByIndex(month);	
}
public void Birth_Day(int day) {
	Select Sinput= new Select(Day);
	Sinput.selectByIndex(day);	 
}
public void Birth_Year(String year) {
	Select Sinput= new Select(Year);
	Sinput.selectByValue(year);
}
public void Gender_Male() {
	Male.click();
}
public void Gender_Female() {
	Female.click();
}

public void Create_Account_Page(String Fname, String Lname, String email, String password,
		int month, int day, String year) {
	this.MainPageTitle();
	this.login();
	this.FirstName(Fname);
	this.LastName(Lname);
	this.Email(email);
	this.Paasword(password);
	this.Birth_Month(month);
	this.Birth_Day(day);
	this.Birth_Year(year);
	this.Gender_Male();
	//this.Gender_Female();
}






}
