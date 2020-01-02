package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
	/*	TC 2: Syntax Page URL Verification: 
			1.	Open chrome browser
			2.	Navigate to “https://www.syntaxtechs.com/”
			3.	Navigate to “https://www.google.com/”
			4.	Navigate back to Syntax Tecnologies Page
			5.	Refresh current page
			6.	Verify url contains “Syntax” */

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.syntaxtechs.com");
		d.navigate().to("https://www.google.com");
		d.navigate().back();
		d.navigate().refresh();
		System.out.println(d.getTitle());
		d.close();
		
		
		
		
		
		
		
	}

}
