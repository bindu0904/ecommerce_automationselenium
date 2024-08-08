package com.seleniumTraining.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.ReadConfig;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        
		ReadConfig details=new ReadConfig();
		String url=details.geturl();
		String firstname=details.getfirstname();
		String email=details.getemail();
		
		
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);;
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
		Thread.sleep(3000);
	}

}
