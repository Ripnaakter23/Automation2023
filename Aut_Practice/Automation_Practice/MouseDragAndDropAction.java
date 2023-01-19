package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome= Driver.findElement(By.id("box6"));
		WebElement italy=Driver.findElement(By.id("box106"));
		WebElement oslo=Driver.findElement(By.id("box1"));
		WebElement spain=Driver.findElement(By.id("box107"));
		Actions act=new Actions(Driver);
		act.dragAndDrop(rome, italy).build().perform();
		act.dragAndDrop(oslo, spain).build().perform();//drag and drop
	}

}
