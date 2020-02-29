package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods {
	/* 
	 * TC 2: HRMS Login
	 * 1.Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * 2.Login to the application by writing xpath based on “following and preceding siblings” */
	
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='spanMessage']/preceding-sibling::input")).click();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
}
