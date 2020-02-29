package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.sun.jdi.connect.Connector.Argument;
import com.utils.CommonMethods;
import com.utils.Constants;

public class JSExecututorDemo extends CommonMethods {
	/*
	 * navigate to the hrms
	 * enter 
	 */
public static void main(String[] args) throws InterruptedException {
	setUp("chrome",Constants.HRMS_URL);
	
	String userName = "Admin";
	String password = "Hum@nhrm123";
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement LoginBtn=driver.findElement(By.id("btnLogin"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].style.backgroundColor='blue'", LoginBtn);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", LoginBtn);
	Thread.sleep(2000);
	//driver.quit();
}
}
