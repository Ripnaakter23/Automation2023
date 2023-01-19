package Automation_Practice;

//import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_CSS {
WebDriver Driver;

@BeforeTest
public void Setup() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
Driver = new ChromeDriver();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Dimension D = new Dimension(1200, 1400);
Driver.manage().window().setSize(D);
Driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
Driver.getTitle();
System.out.println(Driver.getTitle());
Driver.findElement(By.id("divpaxinfo")).click(); 
}
@Test(priority=0)
public void Adult_Selection() throws InterruptedException {
int i= 1;
while(i<7)
{Driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
i++;}
}
@Test(priority=1, dependsOnMethods= {"Adult_Selection"})
public void Child_Selection() {
for (int c=1;c<3;c++)
	//("tagname[attriubute^='val']")
Driver.findElement(By.cssSelector("span[id^='hrefIncC']")).click();
WebElement Button= Driver.findElement(By.cssSelector("input[id='btnclosepaxoption']"));
System.out.println("done Button is Displayed " +Button.isDisplayed());
}

@Test(priority=2)
public void Adult_Child_Assertion(){
	String expected_selection= "7 Adult, 2 Child";
	String actual_selection =Driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText();
	Assert.assertEquals(expected_selection, actual_selection);
	System.out.println("Total passenger selected is " +actual_selection);
}


@Test(invocationCount=2, threadPoolSize=3, enabled= false)
public void Invocation_threadpool() {
Driver= new ChromeDriver();
Driver.get("http://www.google.com");

}
@AfterTest
public void after_method() throws IOException {
	// i  convert the WebDriver object (driver) to TakeScreenshot.
	//And call getScreenshotAs() method to create an image file by providing the parameter *OutputType.FILE.
	// Then i use File object to copy the image at my desired location using the fileUtils class
	File SS=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SS, new File("C:\\ESD\\Passengernumbers.png"));
Driver.close();
}
}


