package January;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
public static String  BaseURL;
public static WebDriver Driver;



@BeforeSuite()
public void setup() {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
Driver = new ChromeDriver();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
BaseURL = "https://www.facebook.com";
}
@BeforeTest()
public void Setup()
{Driver.manage().window().maximize();	
}

@Test(priority=1, enabled=true, invocationCount=3, threadPoolSize=2)
public void OpenBrowser() {
Driver.get(BaseURL);
String ExpectedTitle = "Facebook - log in or sign up";
String ActualTitle=Driver.getTitle();
Assert.assertEquals(ActualTitle, ExpectedTitle);
	
}

@Test(priority=2)
public void CreateAccount(){
Driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();	
Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("beckham");

Driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("davidb123@gmail.com");
WebElement password= Driver.findElement(By.xpath("//input[starts-with(@autocomplete, 'new-pass')]"));
password.sendKeys("abcwieu124");


System.out.println("the password is " +password.getAttribute("value"));
}

@Test(priority = 3)
public void DateOfBirthDropDown() {
WebElement Month= Driver.findElement(By.xpath("//select[@name='birthday_month'][@id='month']"));
//var Mo=Driver.findElement(By.xpath("//select[@name='birthday_month'][@id='month']"));

Select M= new Select(Month);

M.selectByIndex(6);
String SValue=M.getFirstSelectedOption().getText();
System.out.println(SValue);


if(SValue.equalsIgnoreCase("Jul")) {
	System.out.println("month is correct");
}
else {
	System.out.println("month is incorrect");
}
}
@Test(priority=4)
public void Day() {
WebElement Day= Driver.findElement(By.xpath("//select[@id='day']"));
Select D= new Select(Day);
D.selectByIndex(6);
String Svalueday=D.getFirstSelectedOption().getText();
System.out.println(Svalueday);
if(Svalueday.equalsIgnoreCase("9")) {
	System.out.println("day is correct");
}
else {
	System.out.println("day is incorrect");
}
try {
	D.selectByValue("23");
	System.out.println("Day is found to select");
	} catch (Exception e) {
		System.out.println("Couldn't find Day 20");
}
}
@Test(priority=5)
public void Year() {
		WebElement Year= Driver.findElement(By.xpath("//select[@id='year']"));
		Select Y= new Select(Year);
		Y.selectByValue("2000");
		String Svalueday=Y.getFirstSelectedOption().getText();
		System.out.println(Svalueday);
		if(Svalueday.equalsIgnoreCase("2001")) {
			System.out.println("year failed");
		}
		else if(Svalueday.equalsIgnoreCase("2023")) {
			System.out.println("year is incorrect");
		}	
		else if (Svalueday.equalsIgnoreCase("2000")) {
			System.out.println("Year is correct!");
		}
}
@Test(priority=6)
public void Gender() {

try {
	WebElement Male=Driver.findElement(By.xpath("//input[@value='2']"));
	Male.click();
	System.out.println("male is selected");
	Boolean cheile= Male.isSelected();
	System.out.println(cheile);
}
	catch(Exception x) {
		System.out.println("male is not selected");
		x.printStackTrace();
}
}










}
