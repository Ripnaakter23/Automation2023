package Automation_Practice;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://demo.nopcommerce.com/");
		//JavascriptExecutor js=(JavascriptExecutor)Driver;
		//js.executeScript(Script, args);
		
	}

}
