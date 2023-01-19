package testNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
public static WebDriver driver;
@BeforeTest
public void Setup() {
	System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
}
@Test(priority=0)
public void openbrowser () {
driver.get("http://automationpractice.com/index.php");

}

@Test(priority=1)
public void signin() {
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();	
}
@Test(priority=2)
public void email() {
driver.findElement(By.cssSelector("#email_create")).sendKeys("abz@gmail.com");	
}
@Test(priority=3)
public void createAccount() {
driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
}
@Test(priority=4)
public void MrRadio() {
driver.findElement(By.cssSelector("input[id*='_gender']")).click();	
}

@Test(priority=5)
public void firstname() {
	driver.findElement(By.cssSelector("input[id^='customer']")).sendKeys("smith");
}

@Test(priority=6)
public void lastname() {
	driver.findElement(By.cssSelector("input[id='customer_lastname'][name='customer_lastname']")).click();
}

@Test(priority=7)
public void password() {
	driver.findElement(By.cssSelector("input[id$='swd']")).sendKeys("12345");
}

}
