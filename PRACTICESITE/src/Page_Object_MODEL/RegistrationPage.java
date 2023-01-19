package Page_Object_MODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPage {
WebDriver Driver;
By RegLink= By.linkText("REGISTER");
By FirstName= By.name("firstName");
By LastName=By.name("lastName");
By Phone=By.name("phone");
By Email=By.name("userName");
By Address= By.name("address1");
By City = By.name("city");

	
public RegistrationPage(WebDriver Driver) {			//Integrating WebDriver with the class method
	this.Driver=Driver;
	}


public void clickRegLink()
{ Driver.findElement(RegLink).click();
	}
public void setFirstName(String Fname) {
	Driver.findElement(FirstName).sendKeys(Fname);
}
public void setLastName(String Lname) {
	Driver.findElement(LastName).sendKeys(Lname);
}
	public void phone(String ph) {
	Driver.findElement(Phone).sendKeys(ph);}
	
public void setEmail(String mail) {
	Driver.findElement(Email).sendKeys(mail);
}	
	
public void setAddress(String Addres) {
	Driver.findElement(Address).sendKeys(Addres);
}

public void setCity(String Ct) {
	Driver.findElement(City).sendKeys(Ct);
}
}	
	

