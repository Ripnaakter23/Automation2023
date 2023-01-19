package trainingday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		
	WebDriver driver = base.getDriver();
	driver.get("http://automationpractice.com");
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email")).sendKeys("rina452@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Rina7809#");
	driver.findElement(By.id("SubmitLogin")).click();
	
	WebElement signout_button= driver.findElement(By.className("logout"));
	WebElement page_header= driver.findElement(By.className("page-heading"));
	
	String signout_button_text=signout_button.getText();
	String header_text=page_header.getText();
	
	
	//Sysout ctrl+space);
	
	
	System.out.println(signout_button_text);
	System.out.println(header_text);
	
	if(header_text.equals("MY ACCOUNT")) {
		System.out.println("Login test is passed");
	}else {System.out.println("Login test is failed");
	//part 7 of Time & Training
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
