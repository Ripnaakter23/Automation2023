package January2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
String PracticePage= "https://rahulshettyacademy.com/AutomationPractice/";
WebDriver driver= new ChromeDriver();
driver.get(PracticePage);
	}

}

