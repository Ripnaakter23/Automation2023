package Automation_Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.get("https://demo.nopcommerce.com/");
		Driver.manage().window().maximize();
		//Full page screenshot
		File ss = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("c:\\ESD\\fullpage.png"));
		
		//Screenshot of a particular section
		WebElement section= Driver.findElement(By.xpath("//div[@class='item-grid']"));
		File srcfl=section.getScreenshotAs(OutputType.FILE);
		File trgfl= new File("C:\\ESD\\section.png");
		FileUtils.copyFile(srcfl, trgfl);
		
		
	
	}

}
