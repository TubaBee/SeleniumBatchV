package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	/*Open chrome browser
	 * Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	 * 3.Enter valid username and password
	 * 4.Click on login button
	 * 5.Then verify Syntax Logo is displayed.
	 * 
	 * username=sohilaryan
	 * password=syntax@12   	 */
	
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get(URL);
		d.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("sohilaryan");
		d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Syntax@12");
		
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(4000);
		
		d.close();
		
	}
	
	

}
