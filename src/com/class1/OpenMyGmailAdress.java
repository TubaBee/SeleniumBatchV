package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMyGmailAdress {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.gmail.com");
		
		d.findElement(By.id("identifierId")).sendKeys("tuba.onslbee@gmail.com");
		d.findElement(By.className("CwaK9")).click();
		Thread.sleep(1000);
		d.findElement(By.name("password")).sendKeys("Bbtseva8822");
		Thread.sleep(1000);
		d.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		d.quit();
		
	}

}
