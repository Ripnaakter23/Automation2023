package Basic_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Very_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Driver;
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
Driver = new ChromeDriver();
Driver.get("https://www.saucedemo.com"); //Asking ChromeDriver to navigate to google.com
Driver.getCurrentUrl();
System.out.println(Driver.getCurrentUrl());

Driver.getTitle();
System.out.println("What is the Title of the Page?" + Driver.getTitle());
String title="Swag Labs";
if (title.contains("Swag"))
 {
	System.out.println("title is correct " +title);
}
	else {
System.out.println("Title of the Page is something else ");
}



	
	}

}
