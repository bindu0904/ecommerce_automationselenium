 package com.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import junit.framework.Assert;

public class Firstautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(6000);;
		String firstname="HimaBindu";
		String Email="Himabindu@gmail.com";
		String currentaddress="Flat#318,Binghatti Platinum,DSO,Dubai";
		String permanentaddress="Garuda park square,Bengaluru";
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(Email);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("currentAddress")).sendKeys("Flat#318,Binghatti Platinum,DSO,Dubai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Garuda park square,Bengaluru");
		
	
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(5000);
		
		String ExtractedName=driver.findElement(By.xpath("//p[@id='name']")).getText();
		////CHECKING NAME
		String afterextracted=ExtractedName.substring(5);
		System.out.println(afterextracted);
		if(firstname.equals(afterextracted))
		{
			System.out.println("Name is matching with the entered name");
		}
					
		else
			System.out.println("Name is not matching");
		
		Thread.sleep(5000);
		
		//CHECKING EMAIL
		
		String ExtractedEmail=driver.findElement(By.xpath("//p[@id='email']")).getText();
		
		int startindex=ExtractedEmail.indexOf(":");
		String afterextractedEmail=ExtractedEmail.substring(startindex+1);
		System.out.println(afterextractedEmail);
		
		
		// String afterextractedemail=ExtractedEmail.substring(6);
		
		//System.out.println(afterextractedemail);
		Assert.assertEquals(Email, afterextractedEmail);
		
		if(Email.equals(afterextractedEmail))
		{
			System.out.println("Email is matching");
		}
		else
			System.out.println("Email is not matching");
		
        
		//CHECKING CURRENT ADDRESS
		
		String Extractedcurrentaddress=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		int startindex1=Extractedcurrentaddress.indexOf(":");
		String afterextractedcurrentaddress=Extractedcurrentaddress.substring(startindex1+1);
		System.out.println(afterextractedcurrentaddress);
		Assert.assertEquals(currentaddress, afterextractedcurrentaddress);
		
		//CHECKING CURRENT ADDRESS
		
		String Extractedpermanentaddress=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		int startindex2=Extractedpermanentaddress.indexOf(":");
		String afterextractedpermanentaddress=Extractedpermanentaddress.substring(startindex2+1);
		System.out.println(afterextractedpermanentaddress);
		Assert.assertEquals(permanentaddress, afterextractedpermanentaddress);
		
		
		
			
			
	    driver.quit();
		}

}
