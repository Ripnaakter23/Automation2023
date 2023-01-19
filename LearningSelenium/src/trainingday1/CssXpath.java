package trainingday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = base.getDriver();
	driver.get("http://automationpractice.com");
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	//driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a"));
	
	
	
	
	
	
	}

}
