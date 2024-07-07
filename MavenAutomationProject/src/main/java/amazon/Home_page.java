package amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver d;
@FindBy(id="twotabsearchtextbox")
WebElement searchfield;


public void Searching(WebDriver d)  {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	searchfield.sendKeys("shoe"+(Keys.ENTER));
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	/*
	 * TakesScreenshot a1 =(TakesScreenshot) d; File source
	 * =a1.getScreenshotAs(OutputType.FILE); File destination =new
	 * File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Passed Tc\\"+Math.random()+"
	 * .jpg"); try { FileHandler.copy(source, destination); } catch (IOException e)
	 * {
	 * 
	 * e.printStackTrace();
	 */}


public Home_page(WebDriver d) {
	PageFactory.initElements(d, this);


}
}
