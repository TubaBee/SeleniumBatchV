package com.class4;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	/* Radio Buttons Practice  
	Open chrome browser
	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	Click on “Input Forms” links
	Click on “Radio Buttons Demo” links
	Click on any radio button in “Radio Button Demo” section.
	Verify correct checkbox is clicked
	Click on any radio button in “Group Radio Buttons Demo” section.
	Verify correct checkbox is clicked
	Quit browser  */

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']")).click();
		System.out.println("Radio Button is Selected :: "+driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']")).isSelected());
		
		Thread.sleep(4000);
		driver.close();

}
}