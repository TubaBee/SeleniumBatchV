package com.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Ctrl+0 --> to see all methods within the class

public class CommonMethods {

	public static WebDriver driver;

	/**
	 * 
	 * Use this method in need of opening browser and target url
	 * 
	 * @param browser The desired browser
	 * 
	 * @param url     The desired url
	 * 
	 */

	public static void setUp(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			driver = new ChromeDriver();

			driver.get(url);

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

			driver = new FirefoxDriver();

			driver.get(url);

		} else {

			System.err.println("Browser not supported");

		}
	}

	/**
	 * This method will accept the alert
	 * 
	 * @throws will throw an NoAlertPresentException if alert is not present
	 */

	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * This method will dismiss the alert
	 * 
	 * @throws will throw an NoAlertPresentException if alert is not present
	 */

	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * This method get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws will throw an NoAlertPresentException if alert is not present
	 */

	public static String getAlertText() {
		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
		return alertText;
	}

	public static void switchToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}

	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}

	/**
	 * This method with switch to the frame
	 * 
	 * @param index
	 */

	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	
	/**
	 * 
	 * @param element
	 */

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	/**
	 * 
	 * @param element
	 */

	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	/**
	 * This method will scroll page down
	 * @param pixel
	 */

	public static void scrollDown(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")");
	}
	
	/**
	 *  This method will scroll page up
	 * @param pixel
	 */

	public static void scrollUp(int pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-"+pixel+")");
	}

//	public static WebDriver setUp(String browser){

//		

//		if(browser.equalsIgnoreCase("chrome")) {

//			System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");

//			driver=new ChromeDriver();

//		

//		}else if(browser.equalsIgnoreCase("firefox")) {

//			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

//			driver=new FirefoxDriver();

//		}

//		

//		return driver;

//	}
}
