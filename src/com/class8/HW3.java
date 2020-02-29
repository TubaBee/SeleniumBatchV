package com.class8;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HW3 extends CommonMethods {
	/*TC 1: Leave List Search Validation
	 * 1.Open chrome browser
	 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * 3.Login into the application
	 * 4.Select Leave List
	 * 5.Select from December 1, 2019 until January 31, 2020
	 * 6.Check only Pending approval
	 * 7.Click on Search
	 * 8.Validate “No Records Found” is displayedQuit the browser */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		//login into HRMS
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click(); 

}
}