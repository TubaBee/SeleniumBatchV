package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
	/*	TC 1: Amazon Page Title Verification: 
		1.Open chrome browser
		2.Go to “https://www.amazon.com/”
		3.Verify Title “Amazon.com: Online Shopping for 
		Electronics, Apparel, Computers, Books, DVDs & more” 
		is displayed */
		
		
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.com");
		
		String title=d.getTitle();
		System.out.println(title);
		d.close();
		






	}

}
