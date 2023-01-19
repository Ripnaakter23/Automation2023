package POM_PageFactory;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTest2 {
	WebDriver Driver;
	RegistrationPage2 X;
@BeforeTest
public void Setupmethod() {

System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
Driver= new ChromeDriver();
Driver.get("https://demo.guru99.com/test/newtours/");
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Driver.getTitle();
System.out.println("The title is "+ Driver.getTitle());
X= new RegistrationPage2(Driver);
}
@Test
public void verifyingFlightRegTest() {
X.Registration("Ripna", "Akter", "5715991724", "ra23@gmail.com", "1655 demonick dr");	
}
@Test(priority=1)
public void FinalMethod() throws Exception {
	File ss=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ss, new File ("C:\\ESD\\pofactory1.png"));
}

}



