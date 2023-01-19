package Automation_Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validation {
		WebDriver Driver;
@BeforeTest
public void Setupmethod () {
	String istring= "Ripna";
	char[] chars=istring.toCharArray();
	int length=chars.length;
	for(int i = length-1;i>=0;i--) {
		System.out.println(chars[i]);
	}
	String inputstring="London";
	StringBuilder stringbuilder= new StringBuilder(inputstring);
	System.out.println(stringbuilder.reverse());
	
	String inp="sultana";
	StringBuilder stringb= new StringBuilder(inp);
	System.out.println(stringb.reverse());

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 Driver = new ChromeDriver();
 Driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
 Driver.manage().window().maximize();
 Driver.get("https://www.facebook.com");
 Driver.getTitle();
 System.out.println("The Title is " +Driver.getTitle());
}
@Test(priority=0)//groups="functional")
public void createaccount() {
	WebElement Createaccountbutton=Driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	Createaccountbutton.click();
	System.out.println("create account button displayed is = "+ Createaccountbutton.isDisplayed());
	Createaccountbutton.getText();
	System.out.println("the Text is = "+Createaccountbutton.getText());
}
@Test(priority=1)
public void SignUp() throws InterruptedException{
	
	WebElement FirstName= Driver.findElement(By.name("firstname"));
	FirstName.sendKeys("Ripna");
	//Thread.sleep(3000);
	System.out.println("the first name is " +FirstName.getAttribute("Value"));
	WebElement LastName = Driver.findElement(By.xpath("//input[@type='text'][@name='lastname']"));
	LastName.sendKeys("Akter");
	System.out.println("The last name is " +LastName.getText());
	Driver.findElement(By.name("reg_email__")).sendKeys("5715991723");
	Driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Rigsjdh12432");
	
	WebElement Month=Driver.findElement(By.xpath("//select[starts-with(@id,'mont')]"));
	Select M=new Select(Month);
	M.selectByValue("1");
	WebElement option= M.getFirstSelectedOption();
	//String selectedvalue=option.getText();
	System.out.println("the month is " +option.getText());


	WebElement Day= Driver.findElement(By.xpath("//select[@id='day']"));
	Select D= new Select (Day);
	D.selectByVisibleText("6");
	WebElement optionDay=D.getFirstSelectedOption();
	System.out.println("The day is " +optionDay.getText());
	
	WebElement Year=Driver.findElement(By.xpath("//span/preceding::select[@id='year']"));
	Select Y= new Select(Year);
	Y.selectByValue("2007");
	WebElement optionYear=Y.getFirstSelectedOption();
	System.out.println("The year is " + optionYear.getText());
}
	@Test(priority=2)
	public void radiobutton() throws InterruptedException {
	Thread.sleep(3000);
		WebElement radioButton=Driver.findElement(By.xpath("//input[@value='-1']"));
	radioButton.click();;
	radioButton.isSelected();
	if (radioButton.isSelected()) {
		System.out.println("custom is selected");
	}
	else {System.out.println("custom is not selected");
	}

	WebElement SelectYourPronoun = Driver.findElement(By.cssSelector("select[name='preferred_pronoun']"));
	Select SYP= new Select(SelectYourPronoun);
	SYP.selectByValue("2");
	SelectYourPronoun.getAttribute("value");
	System.out.println("the text is " +SelectYourPronoun.getText());
	//css rule3= ("tagname[attribute^='value']"); ---prefix(^)(starts-with)
	Driver.findElement(By.cssSelector("input[name^='custom_gen']")).sendKeys("wewee");
	}
	@AfterTest(alwaysRun=true)
	public void close() throws IOException {
	File ss=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ss, new File("c:\\ESD\\facebookSignUp.jpg"));
	Driver.close();
	}
	
	
	
}

