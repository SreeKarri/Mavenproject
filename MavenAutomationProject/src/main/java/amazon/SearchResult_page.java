package amazon;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResult_page {
	WebDriver d;
	@FindBy(xpath = ("(//a[@class='a-link-normal s-no-outline'])[1]"))
	WebElement shoe1;

	

	public void firstshoe(WebDriver d)  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions a = new Actions(d);
		a.moveToElement(shoe1).perform();
		shoe1.sendKeys(Keys.ENTER);
		

	}

	
	public SearchResult_page(WebDriver d) {
		PageFactory.initElements(d, this);

	}

}