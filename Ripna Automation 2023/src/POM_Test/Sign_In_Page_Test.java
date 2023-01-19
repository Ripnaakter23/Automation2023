package POM_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Pages.Sign_In_Page;

public class Sign_In_Page_Test {
	WebDriver Driver;
	Sign_In_Page X;	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("https://www.facebook.com");
X = new Sign_In_Page(Driver);

	}
@Test
public void CreateAccount() {

	X.CreateAccountPage("Ripna", "Akter", "ripakt27@gmail.com", "afgdu36f4", 7, 3, "2000");
	//X.CreateAccountPage("Rina", "ufo", "riona56@gmail.com", "t7iwet7", 8, 9, "2003");
}
	
	
}
