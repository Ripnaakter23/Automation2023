package testNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day2 extends day1 {
// WebDriver driver;
	
@Test (dependsOnMethods= {"createAccount"},groups= {"functional4", "smoke4"})
public void MrRadio() throws InterruptedException {
Thread.sleep(4000);
driver.findElement(By.cssSelector("input[id*='_gender1']")).click();
int verifyMr=driver.findElements(By.cssSelector("input[id*='_gender1']")).size();
if (verifyMr==1) {
	System.out.println("verified");
}
}
@Test(priority=5,groups= {"functional5", "smoke5"})
public void firstname() {
WebElement firstname=driver.findElement(By.cssSelector("input[id^='customer']"));
boolean firstname_validation=firstname.isDisplayed();
System.out.println("firstname is-"+ firstname_validation);
firstname.sendKeys("Victor");
}

@Test(priority=6,invocationCount=10,groups= {"functional6","regression6","smoke6"})
public void lastname() {
WebElement lastname=driver.findElement(By.cssSelector("input[id='customer_lastname'][name='customer_lastname']"));	
lastname.sendKeys("Smith");	
lastname.clear();
lastname.sendKeys("Butler");
}

@Test(priority=7,groups= {"functional7","smoke7"})
public void password() {
driver.findElement(By.cssSelector("input[id$='swd']")).sendKeys("12345");

	
}
@AfterTest(alwaysRun=true)
public void close() {
driver.close();
}

}
	
	
	
	
	
	
	


