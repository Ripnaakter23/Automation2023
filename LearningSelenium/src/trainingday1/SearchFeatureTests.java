package trainingday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

import org.junit.Test;

public class SearchFeatureTests {

	@Test
public void searchProductByKewword() {

//Search product test case
	WebDriver driver= base.getDriver();
	driver.get("http://www.automationpractice.com");
	driver.findElement(By.id("search_query_top")).sendKeys("printed dress");
	driver.findElement(By.name("submit_search")).click();
	int total_num_img=driver.findElements(By.xpath("//img[@itemprop='image']")).size();
	
	Assert.assertEquals(5, total_num_img);
	driver.quit();
	
}
	
	
	
}
