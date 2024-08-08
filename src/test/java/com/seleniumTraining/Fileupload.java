package com.seleniumTraining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("HimaBindu");
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("bindu.03@gmail.com");
	    StringSelection str=new StringSelection("‪C:\\Users\\chinn\\Desktop\\dad payment.png");
	   
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	    
	    js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='uploadPicture']")));
	    Thread.sleep(3000);
	    
	    //Robot Object creation
	    
	    Robot r=new Robot();
	    //pressing  
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    //Releasing
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    //Pressing ENTER
	    r.keyPress(KeyEvent.VK_ENTER);
	    //Releasing ENTER
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    driver.quit();
	    
		
		
		
		
		
	}

}
