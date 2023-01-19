package Page_Object_MODEL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class verifyFlightRegTest{
@Test
public void verifyFllightRegistration() {
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
WebDriver Driver=new ChromeDriver();
RegistrationPage RGPage= new RegistrationPage(Driver);
Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Driver.get("https://demo.guru99.com/test/newtours/");

RGPage.clickRegLink();
RGPage.setFirstName("Ripna");
RGPage.setLastName("Akter");
RGPage.phone("235736487");
RGPage.setEmail("afsg@gmail.com");
RGPage.setAddress("1545 court davis dr");
RGPage.setCity("anendale");






}
}
