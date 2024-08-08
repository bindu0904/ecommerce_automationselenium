package com.seleniumTraining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	//	WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement links:list)
		{
			String linkvalue=links.getAttribute("href");
	        if(linkvalue==null)
	        {
	        	
	        }
	        else
	        {
	         URL url=new URL(linkvalue);
	     //   URL =new URL(linkvalue);
	        HttpURLConnection con=(HttpURLConnection)url.openConnection();
	        con.connect();
	        
	        
		     }
		
		
	}

}
}
