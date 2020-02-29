package com.class9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;

public class HW4ScreenShot extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		// login into HRMS

		String userName = "Admin";
		String password = "Hum@nhrm123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_core_viewDefinedPredefinedReports")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/ReportFile.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(8000);
		driver.close();
	}
}
