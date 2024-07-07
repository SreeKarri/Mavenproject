package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver d;
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	

	public void useremail() {
		email.sendKeys("jyokarri@gmail.com"+Keys.ENTER);
	}
	
	public void Password() {
		password.sendKeys("Sree98765"+Keys.ENTER);

	}

	

	public Login_Page(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
}
