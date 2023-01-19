package page_factory_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
WebDriver driver;
@FindBy(xpath="//*[@id=\"id_gender1\"]")
WebElement Mr;
@FindBy (xpath="//*[@id=\"customer_firstname\"]")
WebElement FirstName;
@FindBy (xpath="//*[@id=\"customer_lastname\"]")
WebElement LastName;
@FindBy(xpath="//*[@id=\"days\"]")	
WebElement Days;
@FindBy (xpath="//*[@id=\"months\"]")
WebElement Months;
@FindBy(xpath="//*[@id=\"years\"]")
WebElement Years;

public SignUpPage(WebDriver driver) {
this.driver=driver;		
PageFactory.initElements(driver, this);
}
public void Mr() {
Mr.click();	
}
public void FirstName(String FirstNamex) {
FirstName.sendKeys(FirstNamex);
}
public void LastName(String LastNameX) {
FirstName.sendKeys(LastNameX);
}
public void Days(String Dayx) {
Days.click();
Select dayinput= new Select (Days);
dayinput.selectByValue(Dayx);
}
public void Months(String Monthx) {
Months.click();//April
Select monthinput= new Select (Months);
monthinput.selectByVisibleText(Monthx);
}
public void Years(int Yearx) {
Years.click();
Select yearinput= new Select (Years);
yearinput.selectByIndex(Yearx);
System.out.println(Yearx);
}
public void FillSignUpForm(String FirstNamex, String LastNamex, String Dayx, String Monthx, int Yearx) {
this.Mr();
this.FirstName(FirstNamex);
this.LastName(LastNamex);
this.Days(Dayx);
this.Months(Monthx);
this.Years(Yearx);
}
}

