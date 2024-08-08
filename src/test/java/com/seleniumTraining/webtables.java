package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		String firstname=driver.findElement(By.xpath("(//div[@class='rt-td'])[1]")).getText();
		System.out.println(firstname);
		
		
	//	(//div[@class='rt-td'])[4]
	  String firstemail = driver.findElement(By.xpath("(//div[@class='rt-td'])[4]")).getText();
	 System.out.println(firstemail);
	 
	  String firstsalary= driver.findElement(By.xpath("(//div[@class='rt-td'])[5]")).getText();
		 System.out.println(firstsalary);
	   driver.quit();
				
		

	}

}
