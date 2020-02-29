package com.class7;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	/**
	 * TC 1: Verify element is present
	 * 1. Open chrome browser
	 * 2. Go to “https://the-internet.herokuapp.com/”
	 * 3. Click on “Click on the “Dynamic Loading” link
	 * 4.Click on “Example 1...” and click on “Start”
	 * 5.Verify element with text “Hello World!” is displayed
	Close the browser 
	 * @throws InterruptedException */
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://the-internet.herokuapp.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Thread.sleep(8000);
		driver.close();
		
	}
}
