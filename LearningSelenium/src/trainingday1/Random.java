package trainingday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//CSS RULE 1--- ("tagname[attrb='value']") ---------Single attribute
	//ID dynamic
	driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//CSS RULE 2--- ("tagname[attrb='value'][attrb='value']")-----@Multiple Attributes
	//driver.findElement(By.cssSelector(""))
	
		
		
		
		
		
	}

}
