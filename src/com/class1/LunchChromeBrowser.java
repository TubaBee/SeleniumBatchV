package com.class1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static String path = "";

	public static void main(String[] args) throws InterruptedException {
		String path = "";

		// Key Value

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// http--> hypertext transfer protocol
	
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.navigate().to("http://syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();

	}

}
