package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
/*Open chrome browser
2.Go to “http://newtours.demoaut.com/”
3.Click on Register Link
4.Fill out all required info
5.Click Submit
6.User successfully registered
(Create 2 scripts using different locators) */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://newtours.demoaut.com");
		d.findElement(By.linkText("REGISTER")).click();
		d.findElement(By.name("firstName")).sendKeys("Tuba");
		d.findElement(By.name("lastName")).sendKeys("Onsal");
		d.findElement(By.name("phone")).sendKeys("123 121 2345");
		d.findElement(By.id("userName")).sendKeys("tuba.onslbee@gmail.com");
		
		d.findElement(By.name("address1")).sendKeys("1321 ayse fatma hayriye sok atlanta ");
		d.findElement(By.name("city")).sendKeys("Atlanta");
		
		d.findElement(By.id("email")).sendKeys("tuba123");
		d.findElement(By.name("password")).sendKeys("qwerty78");
		d.findElement(By.name("confirmPassword")).sendKeys("qwerty78");
		
		d.findElement(By.name("register")).click();
		
		Thread.sleep(6000);
		
		d.close();
		
		
		
		

	}

}
