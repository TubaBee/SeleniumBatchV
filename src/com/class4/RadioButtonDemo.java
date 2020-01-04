package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonDemo extends CommonMethods {
public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		//opening the browser with url
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
	//	driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
//		driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
		Thread.sleep(3000);
		WebElement femaleRadioB=driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
		Thread.sleep(3000);
		System.out.println(femaleRadioB.isSelected());
		femaleRadioB.click();
		Thread.sleep(1000);
		System.out.println(femaleRadioB.isSelected());
		Thread.sleep(1000);
//		WebElement title=driver.findElement(By.id("buttoncheck"));
//		title.click();
//		Thread.sleep(2000);
//		System.out.println(title.getText());
//		Thread.sleep(6000);
		
		System.out.println("**********************************************************");
		List<WebElement> radioButtons=driver.findElements(By.name("optradio"));
		
		
		
		for(int i=0; i<radioButtons.size(); i++) {
//		boolean isSelected=radioButtons.get(i).isSelected();
//		System.out.println(isSelected);
//			if(!isSelected) {
				radioButtons.get(i).click();
//			
//				Thread.sleep(1000);
//			}
			
		}
		
		driver.close();

}
}