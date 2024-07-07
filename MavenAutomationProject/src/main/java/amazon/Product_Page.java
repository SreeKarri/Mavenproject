package amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
  WebDriver d;
  
  @FindBy(xpath=("//input[@id='add-to-wishlist-button-submit']"))
  WebElement wishlist;
  @FindBy(xpath="//input[@id='add-to-cart-button']")
  WebElement addtocart;
 
  public void Addtolist(WebDriver d)    {
	  
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions a3=new Actions(d);
		a3.moveToElement(wishlist).perform();
	  wishlist.sendKeys(Keys.ENTER);;
  }
  public void cart(WebDriver d)  {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  Actions a1=new Actions(d);
	  a1.moveToElement(addtocart).perform();
	  addtocart.sendKeys(Keys.ENTER);
	  
		/*
		 * TakesScreenshot ts =(TakesScreenshot) d; File source
		 * =ts.getScreenshotAs(OutputType.FILE); File destination =new
		 * File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Passed Tc\\"+Math.random()+"
		 * .jpg"); try { FileHandler.copy(source, destination); } catch (IOException e)
		 * {
		 * 
		 * e.printStackTrace(); }
		 */
  }
  public Product_Page(WebDriver d) {
		PageFactory.initElements(d, this);
}
  
	}

