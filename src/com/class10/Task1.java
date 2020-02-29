package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods {
	/* TC 1: HRMS Login
	 * 1.Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * 2.Login to the application by writing xpath based on “parent and child relation” */
	
	public static void main(String[] args) {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		
		
	}
}
