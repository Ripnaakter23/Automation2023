package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.get("https://demo.opencart.com/");
		WebElement desktopmenu=Driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement macMenuItem=Driver.findElement(By.xpath("//a[normalize-space()='Mac(1)']"));
		Actions act= new Actions(Driver);
		act.moveToElement(desktopmenu).moveToElement(macMenuItem).build().perform();
		
		
	}

}
