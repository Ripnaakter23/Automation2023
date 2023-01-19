package com.medeanalytics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_Login {
@Test
public void login_Test() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver Driver= new ChromeDriver();
	Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Driver.manage().window().maximize();
	Driver.findElement(By.className("username")).sendKeys("Admin");
	Driver.findElement(By.name("password")).sendKeys("admin123");
	Driver.findElement(By.xpath("//button[type='submit']")).click();
	Assert.assertEquals(Driver.getTitle(), "OrangeHRM");
	//Driver.close();
}
}
