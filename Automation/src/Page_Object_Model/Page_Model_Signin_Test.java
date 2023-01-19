package Page_Object_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page_Model_Signin_Test {

WebDriver Driver;

	Sign_in_Page X;

	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://automationpractice.com/index.php");
	X= new Sign_in_Page(Driver);
	}


	@Test
	public void OpenSignInPage() {
	X.OpenloginPage();
	}
}
