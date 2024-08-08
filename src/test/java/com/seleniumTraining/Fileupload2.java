package com.seleniumTraining;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	   // JavascriptExecutor js=(JavascriptExecutor)driver;
	   // js.executeScript("window.scrollBy(0,400)");
	    
	    driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("‪‪C:\\Users\\chinn\\Desktop\\dad payment.png");
	    driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys(Keys.F10);
	    
	    Thread.sleep(3000);
	    
		
		
	}

}
