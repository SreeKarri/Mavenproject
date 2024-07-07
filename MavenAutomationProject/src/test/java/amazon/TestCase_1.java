package amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCase_1 {
@Test
public void Tc1() throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	
	Login_Page l=new Login_Page(d);
	l.useremail();
	l.Password();
	
	Home_page h=new Home_page(d);
	h.Searching(d);
	WebElement getitbytomorrow =d.findElement(By.xpath("(//span[@class='a-label a-checkbox-label'])[2]"));
	
	Assert.assertEquals(getitbytomorrow.isEnabled(), true);
	  TakesScreenshot ts =(TakesScreenshot) d; 
	  File source =ts.getScreenshotAs(OutputType.FILE);
	  File destination =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Passed Tc\\"+Math.random()+".jpg"); 
	   try {
		FileHandler.copy(source, destination);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
