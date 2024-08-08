package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxclickdownloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Toggle'])[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]")).click();
		Thread.sleep(3000);
		
		String result=driver.findElement(By.xpath("//div[@id='result']")).getText();
		System.out.println(result);
		
		driver.quit();
		
		
		
	}

}
