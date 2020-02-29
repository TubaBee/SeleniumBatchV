package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task5Me extends CommonMethods {
	/*
	 * TC 1: Table headers and rows verification 1.Open chrome browser 
	 * 2.Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx” 
	 * 3.Login to the application 
	 * 4.Verify customer “Susan McLaren” is present in the table 
	 * 5.Click on customer details 
	 * 6. sonrasindada update lastname and credit card information 
	 * 7.verify updateed customer name and credit cat number is displayed in table 
	 * 8.Close browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		// login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan ChangingLN");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
		Thread.sleep(1000);driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234567891234567");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).clear();
		Thread.sleep(1000);driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("01/16");
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();

		Thread.sleep(4000);
		driver.close();

		// driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[6]/td[13]")).click();

	}
}
