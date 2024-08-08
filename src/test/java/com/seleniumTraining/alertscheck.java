package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertscheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://demoqa.com/alerts");
		  driver.manage().window().maximize();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,400)");
		  driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		  driver.switchTo().alert().accept();
		//3rd alert
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		  driver.switchTo().alert().dismiss();
		  //4thbutton
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		  String text=driver.switchTo().alert().getText();
		  System.out.println(text);
		  driver.switchTo().alert().dismiss();
		  //5thbutton
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		  driver.switchTo().alert().sendKeys("HimaBindu");
		  driver.switchTo().alert().accept();
		  driver.quit();
		  

	}

}
