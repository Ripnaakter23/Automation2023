package trainingday1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String Title = driver.getTitle();
System.out.println("the title is = "+Title);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("anjdbhs");	
driver.findElement(By.name("lastname")).sendKeys("bored");
driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
driver.findElement(By.id("password_step_input")).sendKeys("ahwsgw564qw");
Select Month= new Select(driver.findElement(By.id("month")));
Month.selectByIndex(2);
Select Day= new Select (driver.findElement(By.id("day")));
Day.selectByIndex(6);
Select Year= new Select (driver.findElement(By.id("year")));
Year.selectByValue("2006");
Thread.sleep(3000);
//in web console type $x("//*[text()='Male']")
driver.findElement(By.xpath("//*[text()='Male']")).click();
	}

}
