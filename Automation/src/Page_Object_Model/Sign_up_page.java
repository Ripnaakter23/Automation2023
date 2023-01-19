package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sign_up_page {
	WebDriver Driver;

	By EmailAddress= By.xpath("//input[@name='email_create']");
	By CreateAccount= By.xpath("//i[@class='icon-user left']");
	By Mr= By.xpath("//input[@id='id_gender1']");
	By Mrs= By.cssSelector("#id_gender2"); //Using CSS id
	By Firstname= By.cssSelector("input[id='customer_firstname']");
	By Lastname= By.cssSelector("input[id^='customer_la']"); //Using CSS Prefix- Starts with ^
	By Password= By.cssSelector("input[id*='assw']"); //Using CSS Substring- Available anywehre *
	By Days= By.cssSelector("#days");
	By Months= By.cssSelector("#months");
	By Years= By.cssSelector("#years");
	By NewsLetter= By.cssSelector("input[id$='sletter']"); //Using CSS Suffix- Ends with $
	By SpecialOffers= By.xpath("//input[contains(@id, 'opt')]"); //Using Xpath contains
	By Company= By.xpath("//input[contains(@id, 'com')]");
	By Address= By.cssSelector("#address1");
	By City= By.cssSelector("#city");
	By State= By.cssSelector("select[id*='_state']");
	By ZipPostalCode= By.cssSelector("#postcode");
	By Country= By.cssSelector("select[id$='ntry']");
	By AdditionalInformation= By.cssSelector("#other");
	By Homephone= By.cssSelector("#phone");
	By MobilePhone= By.cssSelector("#phone_mobile");
	By AssignAddress= By.cssSelector("#alias");

	public Sign_up_page(WebDriver Driver) {
	this.Driver=Driver; //This is the class constructor
	}

	public String createaccountpage() {
	return Driver.getTitle();
	}

	public void Email(String email) {
	Driver.findElement(EmailAddress).sendKeys(email);
	}

	public void Clickcreateaccount() {
	Driver.findElement(CreateAccount).click();
	}


	public void GenderMr() {
	Driver.findElement(Mr).click();
	}

	public void GenderMrs() {
	Driver.findElement(Mrs).click();
	}

	public void Fname(String fname) {
	Driver.findElement(Firstname).sendKeys(fname);
	}

	public void Lname(String lname) {
	Driver.findElement(Lastname).sendKeys(lname);
	}

	public void Password(String passw) {
	Driver.findElement(Password).sendKeys(passw);
	}

	public void Day(int day) {
	WebElement Selectdays= Driver.findElement(Days);
	Select sinput= new Select(Selectdays);
	sinput.selectByIndex(day);
	}
	public void Months(int month) {
	WebElement Selectmonths= Driver.findElement(Months);
	Select sinput= new Select(Selectmonths);
	sinput.selectByIndex(month);
	}
	public void years(String year) {
	WebElement Selectyears= Driver.findElement(Years);
	Select sinput= new Select(Selectyears);
	sinput.selectByValue(year);
	}
	
}
