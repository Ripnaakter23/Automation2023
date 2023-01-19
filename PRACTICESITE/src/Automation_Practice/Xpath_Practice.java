package Automation_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Driver;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Driver.get("http://automationpractice.com/index.php");
String expectedtitle = "My Store";
String actualtitle= Driver.getTitle();

System.out.println("the title is = " + Driver.getTitle());
//if else statement is used for conditional execution
if 
(actualtitle.contentEquals(expectedtitle))	{
System.out.println("title is correct");
}
else
{System.out.println("title is incorrect");
	
}

//Driver.findElement(By.className("login")).click();
Driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']")).click();
Driver.findElement(By.name("email_create")).sendKeys("abc123@xyzzz.com");

Driver.findElement(By.name("SubmitCreate")).click();

//-------------------------@XPath Regular Rule
WebElement GenderM= Driver.findElement(By.xpath("//input[@id='id_gender1']")); //XPath Rule ("//tagname[@attribute='value']")
GenderM.click();

Boolean GenderF= Driver.findElement(By.xpath("//input[@id='id_gender2']")).isSelected();
System.out.println("Is Female selected? "+GenderF);

WebElement Fname= Driver.findElement(By.xpath("//*[@id='customer_firstname']"));
Fname.sendKeys("John");
Fname.getAttribute("value");
System.out.println("Firstname= " + Fname.getAttribute("value"));

Driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Snow");

//XPath Rule2= ("//tagname[contains(@attribute, 'value')]")
//----------------------------@XPath Contains rule
Driver.findElement(By.xpath("//input[contains(@id, 'sswd')]")).sendKeys("Knight123");
Driver.findElement(By.xpath("//input[contains(@id, 'sswd')]")).clear();


WebElement Day= Driver.findElement(By.xpath("//select[@id='days'][@name='days']"));
Select Days = new Select(Day);
Days.selectByValue("1");

/*WebElement Month= Driver.findElement(By.xpath("//select[@id='months'][@name='months']"));
Select Months = new Select(Month);
Months.selectByIndex(4);

//XPath Rule3 ("//tagname[@attribute='value'][@attribute='value']")
//---------------------------@XPath using 2/multiple attribute
WebElement Year= Driver.findElement(By.xpath("//select[@id='years'][@name='years']"));
Select Years = new Select(Year);
Years.selectByVisibleText("2006  ");

Years.getFirstSelectedOption().getText();
System.out.println("What is the Year selected? "+ Years.getFirstSelectedOption().getText());*/


//XPath Rule4 ("tagname/descendant::elementTagname[index]")
//Descendant- Goes from TOP to Bottom
WebElement Month= Driver.findElement(By.xpath("//body/descendant::select[2]"));
Select Months = new Select(Month);
Months.selectByIndex(4);

//XPath Rule5 (//Tagname/tagname/preceding::elementTagname[@attribute-'value'])
//Preceding- Going from Bottom to TOP
WebElement Year= Driver.findElement(By.xpath("//div/div/preceding::select[@id='years']"));
Select Years = new Select(Year);
Years.selectByVisibleText("2006  ");

Years.getFirstSelectedOption().getText();
System.out.println("What is the Year selected? "+ Years.getFirstSelectedOption().getText());

//XPath Rule6= ("//tagname[starts-with(@attribute, 'value')]")
//----------------------------@XPath Starts-with rule
Driver.findElement(By.xpath("//input[starts-with(@id, 'news')]")).click();

Driver.findElement(By.xpath("//input[starts-with(@id, 'opti') or (@name='optinabcxyz') and (@value='1')]")).click();

//XPath Rule7= ("//tagname[@attribute='value']/preceding-sibling::tagname[1]")
//Preceding- Going from Bottom to TOP
Driver.findElement(By.xpath("//span[@class='inline-infos']/preceding-sibling::input[1]")).sendKeys("123 Random st");

Driver.findElement(By.xpath("//input[@id='city']/ancestor::p[1]")).click();
Driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Brooks");
Driver.findElement(By.xpath("//input[contains(@id, 'compa')]")).sendKeys("ABC company LTD");
WebElement State= Driver.findElement(By.xpath("//select[@id='id_state']"));
Select S = new Select (State);
S.selectByIndex(2);
Driver.findElement(By.xpath("//input[starts-with(@id, 'postcode')]")).sendKeys("20110");
WebElement Country=Driver.findElement(By.xpath("//p/preceding::select[@id='id_country']"));
Select C= new Select(Country);
C.selectByVisibleText("United States");
Driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("5715721726");

//Driver.close();
}

}
