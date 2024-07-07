package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page {
	WebDriver d;
	
@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
WebElement procedtocheckout;

@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
WebElement phone;

@FindBy(id="address-ui-widgets-enterAddressLine1")
WebElement address1;

@FindBy(id="address-ui-widgets-enterAddressLine2")
WebElement address2;

@FindBy(id="address-ui-widgets-enterAddressCity")
WebElement city;

@FindBy(xpath=("(//span[@class='a-button-text a-declarative'])[2]"))
WebElement state;
@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_14")
WebElement select1st;
@FindBy(id="address-ui-widgets-enterAddressPostalCode")
WebElement pincode;

@FindBy(id="address-ui-widgets-use-as-my-default")
WebElement checkbox;

//@FindBy(xpath=("(//span[@class='a-expander-prompt'])[1]"))
//WebElement notes;

@FindBy(xpath=("(//input[@class='a-button-input'])[5]"))
WebElement usethisadd;
public void procheckout(WebDriver d) {
	procedtocheckout.sendKeys(Keys.ENTER);
}
public void ph(WebDriver d) throws InterruptedException {
	Actions a=new Actions(d);
	Thread.sleep(3000);
	a.moveToElement(phone).perform();
	phone.sendKeys("9929006644");
}
public void address1(WebDriver d) {
	address1.sendKeys("3370 SoniaTrl");
}
public void address2(WebDriver d) {
	address2.sendKeys("201");
}
public void city(WebDriver d) {
	city.sendKeys("Ellicott");
}
public void country(WebDriver d)  {
	state.click();}
public void selectstate(WebDriver d) throws InterruptedException{
	
Actions a1=new Actions(d);
	Thread.sleep(2000);
	a1.moveToElement(select1st).perform();
	Thread.sleep(3000);
	select1st.click();
}
public void pin(WebDriver d) throws InterruptedException {
	pincode.sendKeys("21043");
	Thread.sleep(2000);
}
public void checkbox(WebDriver d) {
	checkbox.click();
}


 
public void usethisadd(WebDriver d) throws InterruptedException

{
	Thread.sleep(2000);
	Actions a4=new Actions(d);
a4.moveToElement(usethisadd).perform();
	usethisadd.click();
}
public CheckOut_Page(WebDriver d) {
	PageFactory.initElements(d, this);
}
}
