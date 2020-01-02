package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver drive=new ChromeDriver();
		
		drive.get("http://www.facebook.com");
		
		
		System.out.println(".......~~~~~~~~~~~~...............");
		String u=drive.getTitle();
		System.out.println(u);
		drive.close();
		

	}

}
