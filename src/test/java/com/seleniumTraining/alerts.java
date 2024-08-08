package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	     WebDriver driver=new ChromeDriver();                          
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	    js.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	//   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	  //  Thread.sleep(3000);
	 //   driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
		
	    
	}

}
