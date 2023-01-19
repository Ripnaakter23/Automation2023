package Basic_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_Practice_GTPL_Bank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("http://demo.guru99.com/V1/index.php");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		


		//CSS Rule1 --- ("tagname[attribute='value']") ----Single Attribute
		Driver.findElement(By.cssSelector("input[onkeyup='validateuserid();']")).sendKeys("mngr424742");

		//CSS Rule2 --- ("tagname[attribute='value'][attribute='value']") ----Multiple Attribute
		Driver.findElement(By.cssSelector("input[name='password'][onkeyup='validatepassword();']")).sendKeys("dazegYg");

		Driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
		

		
		//CSS Rule3 --   ("tagname[attriubute^='val']")   --- Prefix (Starts-with) -- ^
		//JavascriptExecutor NC = (JavascriptExecutor)Driver;
		//NC.executeScript("arguments[0].click();", Driver.findElement(By.xpath("//div/ul/li/preceding::a[@href='addcustomerpage.php']")));
		Driver.findElement(By.xpath("//div/ul/li/preceding::a[@href='addcustomerpage.php']")).click();


		//CSS Rule4  --  ("tagname[attribute='value']:nth-child(indexofthechild)") --- Locating element from child as index
		Driver.findElement(By.cssSelector("input[name='rad1']:nth-child(2)")).click();


		//CSS Rule5 --   ("tagname#value") --Locating id with #
		//Driver.findElement(By.cssSelector("input#dob")).sendKeys("01/01/2020");


		JavascriptExecutor JS = (JavascriptExecutor)Driver;
		JS.executeScript("document.getElementById('dob').value='2000-05-01'");


		//CSS Rule6 --- ("tagname[attribute$='Ends-with value']")   ----Suffix ($= Ends-with)
		Driver.findElement(By.cssSelector("input[onkeyup$='ity();']")).sendKeys("Brooks");

		Thread.sleep(3000);
		//Preceding -- Going from Bottom to TOP
		Driver.findElement(By.xpath("//tr/td/label/preceding::input[@name='city']")).clear();


		//Descendant -- Going from TOP to Bottom
		Driver.findElement(By.xpath("//body/descendant::input[7]")).sendKeys("12345");


		//Preceding-sibling
		Driver.findElement(By.xpath("//label[@id='message5']/preceding-sibling::input")).sendKeys("Arizona");


		Driver.findElement(By.xpath("//input[@name='emailid']/ancestor::tr")).click();

		//CSS Rule7 ("tagname[attribute*='Anything_from_the_middle value']") ---_Substring (* middle value)
		Driver.findElement(By.cssSelector("input[onkeyup*='teTele']")).sendKeys("9291234567");
		
		/* handleing dropdown
		WebElement drop= Driver.findElement(By.id("ahsg"));
		Select D= new Select(drop);
		List<WebElement> alloptions= D.getOptions();
		for (WebElement option:alloptions)
		{if (option.getText().equals("cuba"))
		{option.click();
		break; }
			
		}*/

		//Driver.close();
		}

		}