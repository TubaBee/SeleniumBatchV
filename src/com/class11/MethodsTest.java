package com.class11;

import com.utils.CommonMethods;

public class MethodsTest extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https:/expedia.com");
	
	scrollDown(1000);
	Thread.sleep(2000);
	scrollUp(500);
	Thread.sleep(2000);
	driver.quit();
	
	
	
}
}
