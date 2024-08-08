package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framemsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
	    String msg=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	    System.out.println(msg);
	    driver.quit();

	}

}



    //(//div[@id='framesWrapper']//div)[1]


//for message
