package automation_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class pom_default_class {
public static WebDriver driver;
public static WebDriverWait xWait;
public static String BaseUrl;



@BeforeSuite
public void Initialize() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	xWait= new WebDriverWait(driver,15);
	BaseUrl="http://automationpractice.com/index.php";	
	driver.manage().window().maximize();
	driver.get(BaseUrl);
	
	}

@AfterSuite
public void shutdown() {
	pom_default_class.driver.quit();
}	
	
}
