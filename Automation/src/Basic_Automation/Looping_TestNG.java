package Basic_Automation;

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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Looping_TestNG {
	WebDriver Driver;


	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	Driver.getTitle();
	System.out.println("Title of the Page: " +Driver.getTitle());
	Driver.findElement(By.id("divpaxinfo")).click();
	}


	@Test (priority=0)
	public void Adult_Selection() throws InterruptedException {
	int i=1; //While loop has conditions first
	while(i<7)
	{Driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
	i++;
	}}


	@Test (priority=1)
	public void Child_Selection() throws InterruptedException {
	for(int k=1;k<3;k++) //For loop has condition + Selection at one place
	Driver.findElement(By.id("hrefIncChd")).click();
	Thread.sleep(3000);


	//Boolean Validations
	WebElement Button= Driver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
	System.out.println("Done Button is Displayed? " +Button.isDisplayed()); //Validation1
	System.out.println("Done Button is Selected? " +Button.isSelected()); //Validation2
	System.out.println("Done Button is Enabled? " +Button.isEnabled()); //Validation3
	}



	/*@Test
	public void Adult_Selection1() {
	int l=1;
	do {Driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
	System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
	l++;
	}while (l<7);*/






	@Test (priority=2, dependsOnMethods= {"Child_Selection"})
	public void Asserting_Adult_Child() {

	String ActualResult= Driver.findElement(By.id("divpaxinfo")).getText();
	String ExpectedResult= "7 Adult, 2 Child";

	Assert.assertEquals(ExpectedResult, ActualResult);

	System.out.println("What is the Actual Passenger? " + ActualResult ); //Printing Actual Passenger
	}



	@Test(invocationCount=8, threadPoolSize=8, enabled= false)
	public void Invocation_threadpool() {
	Driver= new ChromeDriver();
	Driver.get("http://www.google.com");

	}

	@AfterTest
	public void After_Method() throws IOException {

	//Converts WebDriver object to TakesScreenShot and takes the SS
	//Calls getScreenshotAs method to define FileType
	File SS=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);

	//Executing and taking Screenshot
	//Saving into the dest folder
	FileUtils.copyFile(SS, new File("C:\\ESD\\Passengernumbers.png"));

	Driver.close();
	}
	}

