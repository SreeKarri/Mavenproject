package AutomationTesting.MavenAutomationProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_LOginPage {
	WebDriver d;
    //Locate each element FindBy Annotation
	@FindBy(id="email")
	WebElement email;
	@FindBy(name="pass")
	WebElement password;
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	public void email() {
		email.sendKeys("jyokarri@gmail.com");
	}
	public void pasword() {
		password.sendKeys("jyo1234");
	}
	public void login() {
		loginbutton.click();
	}
	//initialize each element using pageFactory class inside the constructor
	public FaceBook_LOginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
}
