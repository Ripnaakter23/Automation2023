package testNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 extends day1 {
	
public void setup() {
	
	driver.manage().window().maximize();
	/*System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	xWait= new WebDriverWait(driver,10);*/
}	
@Test(priority=0)
public void openbrowser() {
driver.get(BaseUrl);	
}
@Test(priority=1)
public void signin(){
WebElement SignIn=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
System.out.println("sign in button is visible -"+ SignIn.isDisplayed());
SignIn.isDisplayed();
SignIn.click();
	
}	
@Test(priority=2)
public void email() {
WebElement Email=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
System.out.println("Email Box button is visible-" +Email.isDisplayed());
System.out.println("Email Box button is enabled-" +Email.isEnabled());
System.out.println("Email Box is Selected-" +Email.isSelected());
Email.sendKeys("abz@gmail.com");
}

@Test(priority=3)
public void CreateAccount() {
WebElement CreateAccount=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
xWait.until(ExpectedConditions.visibilityOf(CreateAccount));
System.out.println("CreateAccount Box button is visible-" +CreateAccount.isDisplayed());
System.out.println("CreateAccount Box butto is enabled-" +CreateAccount.isEnabled());
System.out.println("CreateAccount Box is Selected-" +CreateAccount.isSelected());
CreateAccount.click();

}

@Test(priority=4)
public void Mr() throws InterruptedException {
Thread.sleep(2000);	
WebElement Mr=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
System.out.println("Mr button is visible-" +Mr.isDisplayed());
System.out.println("Mr button is Enabled-" +Mr.isEnabled());
Mr.click();
System.out.println("Mr button is Selected-" +Mr.isSelected());
	
}
@Test(priority=5)
public void FirstName() {
	WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
	xWait.until(ExpectedConditions.visibilityOf(FirstName));
	System.out.println("FirstName is visible-" +FirstName.isDisplayed());
	System.out.println("FirstName is enabled-" +FirstName.isEnabled());
	
FirstName.sendKeys("smith");
String expectedvalue="smith";
String actualvalue=FirstName.getAttribute("value");
Assert.assertEquals(actualvalue, expectedvalue);
System.out.println("FirstName is selected-" +FirstName.isSelected());
}

@Test(priority=6)
public void Days() {
WebElement Days=driver.findElement(By.xpath("//*[@id=\"days\"]"));
System.out.println("Days is visible-" +Days.isDisplayed());
System.out.println("Days is enabled-" +Days.isEnabled());
Days.click();
Select dinput=new Select(Days);
dinput.selectByValue("9");
String option=dinput.getFirstSelectedOption().getText();
Assert.assertEquals("9",option);
	
}
@AfterTest()
public void closebrowser() {
	driver.close();
}

}
