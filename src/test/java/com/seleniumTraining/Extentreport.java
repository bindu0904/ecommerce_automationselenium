package com.seleniumTraining;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MM-dd-HH-mm-ss");
		LocalDateTime now=LocalDateTime.now();
		String time=dtf.format(now);
		
		
		
		extent=new ExtentReports();
		
		spark=new ExtentSparkReporter("./Reports/UserdetailsReport_"+time+".html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Final Test report");
		
		extent.attachReporter(spark);
		
		test =extent.createTest("Login Test");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		test.info("Launched the website");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("HimaBindu");
		test.info("Entered first name");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bindu.03@gmail.com");
		test.info("Entered Email");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		test.info("Clicked on Sublit Button");
		
		
		extent.flush();
		 

	}

}
