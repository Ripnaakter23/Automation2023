package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class VerifytitleAndTextTest {
	
@Test(groups="regression")
public void titleTest() {
SoftAssert softassert=new SoftAssert();
String expectedtitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
String expectedtext= "Search";
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.ebay.com/");
driver.manage().window().maximize();
String actualtitle=driver.getTitle();
System.out.println("verifying title");
softassert.assertEquals(actualtitle, expectedtitle);
String actualtext=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
System.out.println("Verifying text");
softassert.assertEquals(actualtext, expectedtext,"Text verification passed");
System.out.println("closing browser");
driver.close();
softassert.assertAll();
}

	
	
	
}
