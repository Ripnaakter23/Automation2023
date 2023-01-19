package Basis_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Very_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Driver;
Driver = new ChromeDriver();


Driver.get("https://www.saucedemo.com"); //Asking ChromeDriver to navigate to google.com
Driver.getCurrentUrl();
System.out.println(Driver.getCurrentUrl());

Driver.getTitle();
System.out.println("What is the Title of the Page?" + Driver.getTitle());




	
	}

}
