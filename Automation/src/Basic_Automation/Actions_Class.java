package Basic_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
public class Actions_Class {

WebDriver Driver;

@BeforeTest
public void Setup() {

System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Driver.get("https://demoqa.com/droppable/");
Driver.getTitle();
System.out.println("Title of the Page: " +Driver.getTitle());
}

@Test (priority=0)
public void DragAndDrop() {

WebElement From= Driver.findElement(By.cssSelector("div#draggable"));
WebElement To= Driver.findElement(By.cssSelector("div#droppables"));

Actions builder= new Actions (Driver);

builder.clickAndHold(From).moveToElement(To).release(To).build().perform();

String textTo= To.getText();
if (textTo.equals("Dropped!")) {
System.out.println("Passed: Element is dropped on target as expected");}
else {
System.out.println("Failed: Element couldn't be dropped to the target as expected");
}
}

@Test(priority=1, dependsOnMethods= {"DragAndDrop"})
public void Keys() {
Driver = new ChromeDriver();
Driver.get("https://www.facebook.com/");
WebElement Email= Driver.findElement(By.id("email"));


Actions builder= new Actions (Driver);
Action seriesofActions= builder
.moveToElement(Email)
.click()
.keyDown(Email, Keys.SHIFT)
.sendKeys(Email, "jondoe52")
.keyUp(Email, Keys.SHIFT)
.doubleClick()
.build();

seriesofActions.perform();
}


@Test(enabled= false)
public void UpperCase() {
Driver = new ChromeDriver();
Driver.get("https://www.facebook.com/");
WebElement Email= Driver.findElement(By.id("email"));
Email.sendKeys(Keys.chord(Keys.SHIFT, "eric johnson", Keys.CONTROL, "a"), Keys.DELETE);;

}
}


