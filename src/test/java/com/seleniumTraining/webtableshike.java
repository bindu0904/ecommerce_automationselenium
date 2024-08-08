package com.seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableshike {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
	//	((//div[@class='rt-tbody']//div[@class='rt-tr-group'])[1]//div[@class='rt-td'][3])
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']"));
		//int Length=list.size();
		
		
		
		for(int i=1;i<=3;i++)
		{
			String firstname=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'][1])")).getText();
			String age=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'][3])")).getText();
			String Email=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'][4])")).getText();
			String salary=driver.findElement(By.xpath("((//div[@class='rt-tbody']//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'][5])")).getText();
		
			
			
			
			if(firstname!=null && age!=null && Email!=null && salary!=null)
				
		{
				int hike=Integer.valueOf(salary) * 10/100;
				int finalsalary=hike+Integer.valueOf(salary);
				System.out.println(firstname + " " +age+ " " +Email+ " " +finalsalary);
			
			
		}
			
		
		}
		
		
		
		
		

	}

}
