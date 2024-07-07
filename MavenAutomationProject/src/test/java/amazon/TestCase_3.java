package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase_3 {
	@Test
	public void Tc2() throws InterruptedException {
	WebDriver d=new EdgeDriver();
	d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	Login_Page l=new Login_Page(d);
	l.useremail();
	l.Password();
	Home_page h=new Home_page(d);
	h.Searching(d);
	SearchResult_page s=new SearchResult_page(d);
	s.firstshoe(d);
	Product_Page p=new Product_Page(d);
	p.Addtolist(d);
	
	WebElement addtoCart =d.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	Assert.assertEquals(addtoCart.isDisplayed(),true);
	
}
}
