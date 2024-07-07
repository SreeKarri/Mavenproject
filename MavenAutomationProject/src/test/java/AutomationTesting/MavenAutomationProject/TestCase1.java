package AutomationTesting.MavenAutomationProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
@Test
public void loginToFacebookusingvalidCredentials() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/login.php/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	FaceBook_LOginPage f1=new FaceBook_LOginPage(d);
	f1.email();
	f1.pasword();
	f1.login();
}
}
