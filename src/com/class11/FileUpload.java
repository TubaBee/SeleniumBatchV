package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods{
	/* navigate to "https:/the-internet.herokuapp.com/upload"
	 * upload the file
	 * verify file is oploaded
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https:/the-internet.herokuapp.com/upload");
		//to upload file we can use sendKeys method and provide full path to the file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Tuba\\Desktop\\selenium class2 homework.png");
		Thread.sleep(5000);
		driver.findElement(By.className("button")).click();
		
		//verify 
		WebElement uploaded=driver.findElement(By.xpath("//div[@id=‘uploaded-files’]/preceding-sibling::h3"));
		//if(uploaded)
	
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
