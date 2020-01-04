package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownDemo extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";


	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		Thread.sleep(1000);
		WebElement weekDropDown=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDropDown);
		select.selectByIndex(4);
		Thread.sleep(1000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(1000);
		select.selectByValue("Friday");
		
		System.out.println("Is This Select mutiple or not"+select.isMultiple());
		
		driver.close();
	}

}
