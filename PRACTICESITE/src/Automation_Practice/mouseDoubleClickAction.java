package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDoubleClickAction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Driver;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Driver.get("https://w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
Driver.switchTo().frame("iframeResult");	
WebElement field1=Driver.findElement(By.xpath("//input[@id='field1']"));
field1.clear();
field1.sendKeys("Welcome to selenium");
WebElement button=Driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
Actions act= new Actions(Driver);
act.doubleClick(button).build().perform();
	
	}
	}
