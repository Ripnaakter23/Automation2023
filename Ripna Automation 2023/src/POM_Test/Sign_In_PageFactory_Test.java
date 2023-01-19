package POM_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Pages.Sign_In_PageFactory;

public class Sign_In_PageFactory_Test {
WebDriver Driver;
Sign_In_PageFactory Y;
@BeforeTest
public void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
Driver= new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Driver.get("https://www.facebook.com");
Y= new Sign_In_PageFactory(Driver);
}	
@Test(priority=1)
public void CreateAccount() {
	Y.Create_Account_Page("Adam", "Sandler", "adam356@yahoo.com", "hsdu54376", 9, 5, "2011");
//Y.Create_Account_Page("Robert", "Sandler", "Robert356@yahoo.com", "hsdu5437", 9, 5, "2011");
}
	
	
	
	
	
	
}

