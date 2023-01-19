package Aut_1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day_1 {
public WebDriver driver;
public String BaseUrl;	
	
@BeforeSuite
public void ProjectSetup() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
BaseUrl="http://automationpractice.com/index.php";


}

@BeforeTest
public void Setup() {
driver.manage().window().maximize();	
	
}  

@Test (priority = 0)
public void openbrowser() {
driver.get(BaseUrl);	
//String Actual_Title= driver.getTitle();
//System.out.println("Title is-" +Actual_Title);

}
@Test (priority = 1, invocationCount=2)
public void SignIn() throws InterruptedException {
WebElement signin=driver.findElement(By.xpath("//a[@class='login']"));
System.out.println("signin button is displayed-" +signin.isDisplayed());
signin.click();

WebElement email=driver.findElement(By.cssSelector("#email_create"));
System.out.println("email is enabled-" +email.isEnabled());
email.sendKeys("genZ@yahoo.com");
Thread.sleep(5000);
}

@Test (priority = 2)
public void createAccount() throws InterruptedException {
	Thread.sleep(2000);
WebElement createaccount=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
System.out.println("createaccount button is selected-" +createaccount.isSelected());
createaccount.click();

}
@AfterTest
public void CloseBrowser(){
	driver.close();
	
	
}
}