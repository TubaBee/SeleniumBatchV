package com.class9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;

public class ScreenShotDemo extends CommonMethods {
	public static void main(String[] args) {

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		// login into HRMS

		String userName = "Admin";
		String password = "Hum@nhrm123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		// validation that admin logged in

		String welcomText = driver.findElement(By.id("welcome")).getText();
		if (welcomText.contains(userName)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.quit();
		
		//homework take screenshot as a proof that "No record message is displayed"a
	}
}
