package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    
	    driver.findElement(By.xpath("//span[@class='rct-title']")).click();
	    Thread.sleep(3000);
	    
	  /*  Boolean isselected=driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]")).isSelected();
	    System.out.println(isselected);*/
	    driver.quit();
		
	    

	}

}
