package Automation_Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handling_alert {
WebDriver Driver;

@BeforeTest
public void Setup (){
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
Driver= new ChromeDriver();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Driver.manage().window().maximize();
Dimension DM= new Dimension (1200,500);
Driver.manage().window().setSize(DM);
Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
Driver.getTitle();
System.out.println("The title of the page is "+Driver.getTitle());
String ActualTitle= Driver.getTitle();
String ExpectedTitle= "Practice Page";
Assert.assertEquals(ActualTitle, ExpectedTitle);


}
@Test(priority=0) //threadPoolSize=2, invocationCount=2)
public void name() throws InterruptedException{
	Driver.findElement(By.xpath("//input[@id='name']")).sendKeys("david");
 Driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value");
 System.out.println("The name is " +Driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value"));
Driver.findElement(By.xpath("//input[@class='btn-style']")).click();
WebDriverWait wait= new WebDriverWait (Driver, 5);
wait.until(ExpectedConditions.alertIsPresent());
Driver.switchTo().alert().accept();
Driver.switchTo().alert().getText();
System.out.println("Text from alert " +Driver.switchTo().alert().getText());
}
@Test
public void closingBrowser() throws IOException{
File ss = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(ss, new File("C:\\ESD\\Alert.png"));
Driver.close();

}
}