package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("http://automationpractice.com/index.php");
 driver.manage().window().maximize();
 driver.findElement(By.className("login")).click();
 driver.findElement(By.id("email_create")).sendKeys("robertson@gmail.com");
driver.findElement(By.name("SubmitCreate")).click();		
driver.findElement(By.id("id_gender1")).click();
driver.findElement(By.name("customer_firstname")).sendKeys("Robertson");
driver.findElement(By.id("customer_lastname")).sendKeys("William");
driver.findElement(By.id("passwd")).sendKeys("william123");
WebElement Days= driver.findElement(By.id("days"));
Select D= new Select(Days);
D.selectByValue("10");
WebElement Months=driver.findElement(By.id("months"));
Select M= new Select(Months);
M.selectByIndex(11);
	}

}
