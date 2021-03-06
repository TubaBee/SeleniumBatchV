package com.class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PageLoadendImplicitWait extends CommonMethods {

	public static void main(String[] args) {
		
		setUp("chrome","http://google.com");
		//page load waits until all elements on the page gets fully loaded
		//if element wont load within 30 seconds you will get TImeOutExpception
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//tell webdriver to wait for element before throwing NoSuchElementException
		//we need implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("IPhone");
		
		
		driver.close();
		
	}

}
