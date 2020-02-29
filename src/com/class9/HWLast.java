package com.class9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class HWLast extends CommonMethods {
	/*TC 1: Table headers and rows verification
	 * 1.Open chrome browser
	 * 2.Go to “https://www.aa.com/homePage.do”
	 * 3.Enter From and To
	 * 4.Select departure as May 14 of 2020
	 * 5.Select arrival as November 8 of 2020
	 * 6.Verify “Choose flights” text is displayed
	 * 7.Take s screenshot of the results
	 * 8.Close browser */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://www.aa.com/homePage.do");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("Orlando");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("Istanbul");
	
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		
	
	List<WebElement> m=driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));

//	for (WebElement ele : m) {
//		if(!(ele.getText().equalsIgnoreCase("May"))){
//			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
//			
//			}
//		}
	TakesScreenshot ts=(TakesScreenshot)driver;
	File picture=ts.getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(picture, new File("screenshots/HRMS/MyScreenOdev.jpg"));
	}catch(IOException e) {
		
	}
	driver.quit();
	}
}
	