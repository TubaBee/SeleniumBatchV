package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class denemem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.gmail.com");

		d.get("https://accounts.youtube.com/accounts/CheckConnection?pmpo=https%3A%2F%2Faccounts.google.com&v=-689948204&timestamp=1577239389952");
		d.findElement(By.id("txtUsername")).sendKeys("tuba.onslbee@gmail.com");
		d.findElement(By.id("btnNext")).click();

	}

}
