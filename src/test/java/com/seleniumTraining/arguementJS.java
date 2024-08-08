package com.seleniumTraining;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arguementJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
				
				
				//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
			    driver.get("https://demoqa.com/text-box");
			    driver.manage().window().maximize();
			    Thread.sleep(3000);
			    //driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Himabindu");
			    JavascriptExecutor js=(JavascriptExecutor)driver;
			    WebElement inputfirstname=driver.findElement(By.xpath("//input[@id='userName']"));
			    js.executeScript("arguments[0].value='HimaBindu'",inputfirstname);
			    WebElement inputemail=driver.findElement(By.xpath("//input[@type='email']"));
			    js.executeScript("arguments[0].value='HimaBindu.03@gmail.com'",inputemail);
				
						
			    WebElement ele=driver.findElement(By.xpath("//button[@id='submit']"));
			   // js.executeScript("arguements[0].click()",ele);

			}

		}

	


