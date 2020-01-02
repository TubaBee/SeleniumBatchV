package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.google.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	d.navigate().to("http://gitHub.com");
	
	int a=d.getTitle().length();
	System.out.println(a);
	
//	d.findElement(By.id("txtEmail")).sendKeys("tuba.onslbee@gmail.com");
		
		d.close();
		
	}
}
