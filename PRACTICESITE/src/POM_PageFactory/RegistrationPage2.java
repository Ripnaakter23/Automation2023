package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {
WebDriver Driver;
@FindBy (linkText="REGISTER")
WebElement Register;

@FindBy (name="firstName")
WebElement FirstName;

@FindBy (name="lastName")
WebElement LastName;

@FindBy (name="phone")
WebElement PhoneNumber;

@FindBy (name="userName")
WebElement Email;

@FindBy (name="address1")
WebElement Address;


	public RegistrationPage2(WebDriver Driver) {			//Integrating WebDriver with the class method
		this.Driver=Driver;										//Instantiating Constructor with this keyword
		PageFactory.initElements(Driver, this);
	}	
public void setRegister() {
	Register.click();
}
	
public void setFirstName(String Fname) {
	FirstName.sendKeys(Fname);
}
public void setLastName(String Lname) {
	LastName.sendKeys(Lname);
}
public void setPhone(String Phone) {
	PhoneNumber.sendKeys(Phone);	
}
public void setEmail(String mail) {
	Email.sendKeys(mail);
}
public void setAddress(String Addres) {
	Address.sendKeys(Addres);
}
public void Registration( String Fname, String Lname, String Phone, String mail, String Addres) {
	this.setRegister();
	this.setFirstName(Fname);
	this.setLastName(Lname);
	this.setPhone(Phone);
	this.setEmail(mail);
	this.setAddress(Addres);
	
}




}
