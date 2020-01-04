package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\\n");
		
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys("admin");
	
	driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
	
	driver.findElement(By.id("btnLogin")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Welcome Admin")).click();
	
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	driver.close();
	
	

	}

}
