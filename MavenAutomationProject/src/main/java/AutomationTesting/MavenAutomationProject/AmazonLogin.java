package AutomationTesting.MavenAutomationProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	WebDriver d;
	
@FindBy(id="ap_customer_name")
WebElement name;
@FindBy(id="ap_email")
WebElement email;

WebElement phone;
@FindBy(name="password")
WebElement password;
@FindBy(xpath="//input[@class='a-button-input']")
WebElement con;

public void first_lastname() {
	name.sendKeys("jyo k");
}
public void ph() {
	phone.sendKeys("karri@gmail.com");
	}

public void Password() throws InterruptedException {
	password.sendKeys("jyo1234");
	Thread.sleep(2000);
}

public void contnue() {
	Actions a=new Actions(d);
	a.moveToElement(con).perform();
	con.sendKeys(Keys.ENTER);
}
   public AmazonLogin(WebDriver d) {
	  PageFactory.initElements(d, this); 
   }
}
