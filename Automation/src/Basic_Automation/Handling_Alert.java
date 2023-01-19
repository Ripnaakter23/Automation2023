package Basic_Automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		Driver = new FirefoxDriver();
		
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		Dimension DM = new Dimension (1560,1230);
		Driver.manage().window().setSize(DM);
		
		Thread.sleep(3000);
		
		JavascriptExecutor JS = (JavascriptExecutor) Driver;
		JS.executeScript("window.resizeTo(1560,1230);");
		JavascriptExecutor name = (JavascriptExecutor) Driver;
	name.executeScript("document.getElementById('name').value='Shein'");
	Driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	WebDriverWait wait= new WebDriverWait (Driver, 5);
	wait.until(ExpectedConditions.alertIsPresent());
	
	Driver.switchTo().alert().accept();
	Driver.switchTo().alert().getText();
	System.out.println("Text from Alert "+Driver.switchTo().alert().getText());
	Driver.close();
		
	}

}
