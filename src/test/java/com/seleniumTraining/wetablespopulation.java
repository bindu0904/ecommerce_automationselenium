package com.seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wetablespopulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/india-population/#:~:text=The%20current%20population%20of%20India,1%2C428%2C627%2C663%20people%20at%20mid%20year");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		List<WebElement> list= driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//tr"));
		int Length=list.size();
		
		//(//div[@class='table-responsive'])[1]//tr
			//	(//div[@class='table-responsive'])[1]//tr[1]//td[3]
		
		for(int i=1;i<Length;i++)
		{
			String Year=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[1]")).getText();
			String Population=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[2]")).getText();
			String change=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[3]")).getText();
			String Yearlychange=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[4]")).getText();
			String Migrants=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[5]")).getText();
			String Medianage=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[6]")).getText();
			String Fertilityrate=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[7]")).getText();
			String Density=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[8]")).getText();
			String Urbanpop=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[9]")).getText();
			String Urbanpopulation=driver.findElement(By.xpath("(//div[@class='table-responsive'])[1]//tr["+i+"]//td[10]")).getText();
			
			System.out.println(Year+ "  " +Population+ "  " +change+ "  " +Yearlychange+ "  " +Migrants+ "  " +Medianage+ "  " +Fertilityrate+ "   " +Density+ "  " +Urbanpop+ "   " +Urbanpop);
		}
		

	}

}
