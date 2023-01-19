package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nested_Frame {
	WebDriver Driver;
	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("C:\\Handler\\Handler\\framenested1.htm");
    Driver.getTitle();
	}
	@Test
	public void Logging_in() {

	Driver.switchTo().frame("iframe2");
	Driver.switchTo().frame("iframe3");
	Driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Casey Burger");
	Driver.findElement(By.cssSelector("input[name='usePwd']")).sendKeys("Cas1143");	
	Driver.switchTo().defaultContent();
	Driver.close();
	
	}
	
}