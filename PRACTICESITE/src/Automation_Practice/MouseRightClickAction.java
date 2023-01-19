package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
WebElement Button=Driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
Actions act= new Actions(Driver);
act.contextClick(Button).build().perform();//Right click action
	}

}
