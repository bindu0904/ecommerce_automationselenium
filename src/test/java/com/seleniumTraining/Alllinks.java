package com.seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    Thread.sleep(3000);
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	    for(WebElement links:list)
	    {
	    	String linkvalue=links.getAttribute("href");
	    	System.out.println(linkvalue);
	    }
		
		 
	}

}
