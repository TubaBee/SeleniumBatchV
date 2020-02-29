package myWork;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class firefoxDemo extends CommonMethods {

	public static void main(String[] args) {
		setUp("firefox","https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("Selenium full course");
		driver.findElement(By.className("style-scope ytd-searchbox")).click();
	}
}
