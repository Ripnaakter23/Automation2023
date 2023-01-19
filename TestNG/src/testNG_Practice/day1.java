package testNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

		public static WebDriver driver;
		public static WebDriverWait xWait;
		public static String BaseUrl;
		//public static String SignUpUrl;
       


		@BeforeSuite(groups= {"functional100", "smoke00"})
		public void projectsetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		xWait=new WebDriverWait(driver,10);
		BaseUrl="http://automationpractice.com/index.php";
		/*SignUpUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		String expectedtitle= "My Store";
		String actual= driver.getTitle();
		Assert.assertEquals(actual, expectedtitle);*/
		
		}

		@BeforeTest(groups= {"functional1","smoke0"})
		public void Setup() {
		//driver.findElement(By.xpath("//*[@class='login']"));
		driver.manage().window().maximize();
		}
		
		@Test(priority = 0,groups= {"functional10","smoke0"})
		public void openbrowser() {
		driver.get(BaseUrl);
		}
		@Test(priority=1,groups= {"functional11","smoke1"})
		public void signin() {
		driver.findElement(By.xpath("//*[@class='login']")).click();
		}

		@Test(priority=2, groups= {"functional12","smoke2"})
		public void email() {
		driver.findElement(By.cssSelector("#email_create")).sendKeys("setu@gmail.com");
		}
		@Test(priority=3, groups= {"functional13","smoke3"})
		public void createAccount() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		Thread.sleep(4000);
		String SignUpUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		String actualUrl=driver.getCurrentUrl();
		System.out.println("SignUpUrl");
		if(actualUrl==SignUpUrl) {
			System.out.println();
		}
		else {
			System.out.println("validation fail");
			System.out.println(actualUrl);
			Assert.assertEquals(actualUrl, SignUpUrl);
		}
		
		

		}

}



