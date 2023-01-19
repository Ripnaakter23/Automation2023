package Basi_Automation;

public class Automation_Parctice_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty(&quot;webdriver.gecko.driver&quot;, &quot;D:\\Downloads\\geckodriver-v0.31.0-

		win32\\geckodriver.exe&quot;);

		Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get(&quot;http://automationpractice.com/index.php&quot;);
		Driver.getTitle();
		System.out.println(Driver.getTitle());

		//Driver.findElement(By.className(&quot;login&quot;)).click();

		Driver.findElement(By.xpath(&quot;//a[@href=&#39;http://automationpractice.com/index.php?controller=my-
		account&#39;]&quot;)).click();

		Driver.findElement(By.name(&quot;email_create&quot;)).sendKeys(&quot;abc123@xyzzz.com&quot;);

		Driver.findElement(By.name(&quot;SubmitCreate&quot;)).click();

		//-------------------------@XPath Regular Rule
		WebElement GenderM= Driver.findElement(By.xpath(&quot;//input[@id=&#39;id_gender1&#39;]&quot;));
		//XPath Rule (&quot;//tagname[@attribute=&#39;value&#39;]&quot;)
		GenderM.click();

		Boolean GenderF=

		Driver.findElement(By.xpath(&quot;//input[@id=&#39;id_gender2&#39;]&quot;)).isSelected();
		System.out.println(&quot;Is Female selected? &quot;+GenderF);

		WebElement Fname= Driver.findElement(By.xpath(&quot;//*[@id=&#39;customer_firstname&#39;]&quot;));
		Fname.sendKeys(&quot;Jon&quot;);
		Fname.getAttribute(&quot;value&quot;);
		System.out.println(&quot;Firstname= &quot; + Fname.getAttribute(&quot;value&quot;));

		Driver.findElement(By.xpath(&quot;//input[@id=&#39;customer_lastname&#39;]&quot;)).sendKeys(&quot;Snow&quot;);

		// XPath Rule2= (&quot;//tagname[contains(@attribute, &#39;value&#39;)]&quot;)
		//----------------------------@XPath Contains rule
		Driver.findElement(By.xpath(&quot;//input[contains(@id, &#39;sswd&#39;)]&quot;)).sendKeys(&quot;Knight123&quot;);
		Driver.findElement(By.xpath(&quot;//input[contains(@id, &#39;sswd&#39;)]&quot;)).clear();

		WebElement Day=

		Driver.findElement(By.xpath(&quot;//select[@id=&#39;days&#39;][@name=&#39;days&#39;]&quot;));

		Select Days = new Select(Day);
		Days.selectByValue(&quot;1&quot;);

		/*WebElement Month=

		Driver.findElement(By.xpath(&quot;//select[@id=&#39;months&#39;][@name=&#39;months&#39;]&quot;));

		Select Months = new Select(Month);
		Months.selectByIndex(4);

		//XPath Rule3 (&quot;//tagname[@attribute=&#39;value&#39;][@attribute=&#39;value&#39;]&quot;)
		//---------------------------@XPath using 2/multiple attribute
		WebElement Year=

		Driver.findElement(By.xpath(&quot;//select[@id=&#39;years&#39;][@name=&#39;years&#39;]&quot;));

		Select Years = new Select(Year);
		Years.selectByVisibleText(&quot;2006 &quot;);

		Years.getFirstSelectedOption().getText();
		System.out.println(&quot;What is the Year selected? &quot;+

		Years.getFirstSelectedOption().getText());*/

		//XPath Rule (&quot;tagname/descendant::elementTagname[index]&quot;)
		//Descendant- Goes from TOP to Bottom
		WebElement Month= Driver.findElement(By.xpath(&quot;//body/descendant::select[2]&quot;));
		Select Months = new Select(Month);
		Months.selectByIndex(4);

		//XPath Rule (//Tagname/tagname/preceding::elementTagname[@attribute-&#39;value&#39;])
		// Preceding- Going from Bottom to TOP
		WebElement Year=

		Driver.findElement(By.xpath(&quot;//div/div/preceding::select[@id=&#39;years&#39;]&quot;));

		Select Years = new Select(Year);
		Years.selectByVisibleText(&quot;2006 &quot;);

		Years.getFirstSelectedOption().getText();
		System.out.println(&quot;What is the Year selected? &quot;+

		Years.getFirstSelectedOption().getText());

		// XPath Rule4= (&quot;//tagname[starts-with(@attribute, &#39;value&#39;)]&quot;)
		//----------------------------@XPath Starts-with rule
		Driver.findElement(By.xpath(&quot;//input[starts-with(@id, &#39;news&#39;)]&quot;)).click();

		Driver.findElement(By.xpath(&quot;//input[starts-with(@id, &#39;opti&#39;) or (@name=&#39;optinabcxyz&#39;)

		and (@value=&#39;1&#39;)]&quot;)).click();
	}

}
