package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.gmail.com");
		
		
	}
}
