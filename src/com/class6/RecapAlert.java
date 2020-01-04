package com.class6;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapAlert extends CommonMethods {

public static void main(String[] args) {
	setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/bootstrap-iframe.html");
	driver.findElement(By.cssSelector("//h3[text()='Syntax Technologies']"));
	
	




}
}
