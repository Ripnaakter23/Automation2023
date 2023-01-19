package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sign_In_Page {
WebDriver Driver;
By PageTitle= By.tagName("title");
By Create_Account =By.xpath("//a[@data-testid='open-registration-form-button']");
By Frist_Name=By.xpath("//input[@name='firstname']");
By Last_Name =By.xpath("//input[@name='lastname']");
By Email = By.xpath("//input[contains(@name,'reg_email__')]");
By Password=By.xpath("//input[starts-with(@autocomplete, 'new-pass')]");
By Birth_Month=By.xpath("//select[@name='birthday_month'][@id='month']");
By Birth_Day= By.xpath("//select[@id='day']");
By Birth_Year= By.xpath("//select[@id='year']");
By Gernder= By.xpath("//input[@value='2']");

public Sign_In_Page(WebDriver Driver) {
this.Driver=Driver;
}

public String MainPageTitle() {
	String title= Driver.getTitle();
	System.out.println(title);
return title;	
}
public void Login() {
	Driver.findElement(Create_Account).click();
}
public void Fname(String Fristname) {
	Driver.findElement(Frist_Name).sendKeys(Fristname);	
	System.out.println("the firstname is "+Fristname);
	if(Fristname=="Ripna") {
		System.out.println("name is correct");}
		else {
			System.out.println("name is incorrect");
			
		}
	}


public void Lname(String Lastname) {
	Driver.findElement(Last_Name).sendKeys(Lastname);
}
public void Email_PhoneNo(String email) {
	Driver.findElement(Email).sendKeys(email);
}
public void Pass_Word(String password) {
	Driver.findElement(Password).sendKeys(password);
}

public void Birth_Month(int month) {
WebElement SelectMonth=Driver.findElement(Birth_Month);
Select Sinput= new Select(SelectMonth);
Sinput.selectByIndex(month);
}

public void Birth_Day(int day) {
	WebElement SelectDay=Driver.findElement(Birth_Day);
	Select Sinput= new Select(SelectDay);
	Sinput.selectByIndex(day);	
}
public void Birth_Year(String year) {
	WebElement SelectYear=Driver.findElement(Birth_Year);
	Select Sinput= new Select(SelectYear);
	Sinput.selectByValue(year);
}
public void GenderMaleFEmale(){
Driver.findElement(Gernder).click();	
}
public void CreateAccountPage(String Fristname, String Lastname, String email, String password,
		int month, int day, String year) {
this.MainPageTitle();
this.Login();
this.Fname(Fristname);
this.Lname(Lastname);
this.Email_PhoneNo(email);
this.Pass_Word(password);
this.Birth_Month(month);
this.Birth_Day(day);
this.Birth_Year(year);
this.GenderMaleFEmale();

}



}
