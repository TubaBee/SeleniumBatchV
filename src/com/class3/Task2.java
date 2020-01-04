package com.class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/*Then verify Syntax Logo is displayed.
	TC 2: HRMS Application Negative Login: 
	1.Open chrome browser
	2.Go to 
	“http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	3.Enter valid username
	4.Leave password field empty
	5.Verify error message with text “Password cannot be empty” is displayed.
	Test Case */
	
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get(URL);
	}

}
