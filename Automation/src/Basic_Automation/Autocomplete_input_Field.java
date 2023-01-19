package Basic_Automation;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autocomplete_input_Field {
	WebDriver Driver;

	@BeforeTest
	public void Setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	Driver.getTitle();
	System.out.println("Title of the Page: " +Driver.getTitle());
	Thread.sleep(3000);
	}


	@Test(groups={"Regression", "Functional"}, priority=1)
	public void AutoComplete() throws InterruptedException {

	Driver.findElement(By.id("autosuggest")).sendKeys("in");
	Driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
	String x= Driver.findElement(By.id("autosuggest")).getText();
	System.out.println(x);
	Thread.sleep(3000);


	JavascriptExecutor js= (JavascriptExecutor)Driver;
	String str= "return document.getElementById(\"autosuggest\").value;";
	String item= (String) js.executeScript(str);

	int i=0;
	while(!item.equals("India")) {
	i++;
	Driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.DOWN);
	Thread.sleep(3000);
	item= (String) js.executeScript(str);
	System.out.println(item);
	if(i>25) {
	break;
	}}
	if(i>25) {
	System.out.println("item not found");
	fail("Desired item not found");
	}else
	{System.out.println("Desired item is found");
	Driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.TAB);
	Thread.sleep(3000);
	Driver.close();
	}}



	@Test
	public void uploading_files() {

	Driver = new ChromeDriver();
	Driver.navigate().to("http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
	Driver.findElement(By.cssSelector("input[name='file_upload']")).sendKeys("C:\\ESD\\Passengernumbers.png");
	}
	}

