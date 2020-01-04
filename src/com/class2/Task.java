package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		/*Open chrome browser
		 * Go to “https://www.facebook.com/”
		 * Enter valid username and valid password and click login 
		 * User should see invalid username or password
		 * click the forgot account button
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com");
//		d.findElement(By.id("email")).sendKeys("yryn.kantin@hotmail.com");
//		d.findElement(By.id("pass")).sendKeys("evlatce123m");
//		d.findElement(By.linkText("Log In")).click();	
//		d.findElement(By.linkText("Forgot account?")).click();
		
		
		
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("yryn.kantin@hotmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("qwerty78");
		
		d.findElement(By.xpath("//input[@value='Log In']")).click();
	
		Thread.sleep(6000);
		d.close();
		
	}

}
