package com.class4;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class CheckBoxDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login//n");

		// driver.manage().window().fullscreen();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();

		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.name("//input[@type='button']"));
		
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
