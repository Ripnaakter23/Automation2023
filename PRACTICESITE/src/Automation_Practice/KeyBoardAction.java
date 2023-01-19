package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.get("https://the-internet.herokuapp.com/key_presses?");
		Actions act= new Actions(Driver);
		act.sendKeys(Keys.ESCAPE).perform();
		act.sendKeys(Keys.UP).perform();
		
		Driver.get("https://text-compare.com/");
		WebElement input1=Driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2=Driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("life is interesting");
		Actions Act= new Actions(Driver);
		//CTRL+A, CTRL+C
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("a");
		Act.keyUp(Keys.CONTROL);
		Act.perform();
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("c");
		Act.keyUp(Keys.CONTROL);
		Act.perform();
		Thread.sleep(3000);
	//TAB-Shift to input2 box //CTRL+V
		Act.sendKeys(Keys.TAB);
		Act.perform();
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("v");
		Act.keyUp(Keys.CONTROL);
		Act.perform();
//compare texts
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("text copied");
		else System.out.println("text not copied");
	}

}
