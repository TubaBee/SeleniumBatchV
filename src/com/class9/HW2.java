package com.class9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HW2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		//Login to the application
		//Verify customer “Susan McLaren” is present in the table
		//Click on customer details
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String expectedText = "Susan McLaren";
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));
        Iterator<WebElement> itr = cells.iterator();
        while (itr.hasNext()) {
            if (itr.next().getText().equals(expectedText)) {
                System.out.println(
                        "TC1 PASSED - (Susan McLaren is displayed and ready to marry and immigrate to US from UK)");
                for (int i = 1; i < 11; ++i) {
                    itr.next();
                    if(i==10) {
                        itr.next().click();
                    }
                }
                break;
            }
        }
        String updatedName = "Susan Shavkat";
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(updatedName);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("111222333444");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("05/05");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        
        //verification of updated name is Displayed
        
         String updatedCardInfo = "Visa 111222333444 05/05";
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        //System.out.println(rows.size());
        for(WebElement row:rows) {
            if(row.getText().contains(updatedName)) {
                System.out.println("TC2 PASSED - (Susan Successfully Married and Her New Name is Displayed) - " + updatedName);
                if(row.getText().contains(updatedCardInfo)) {
                    System.out.println("TC3 PASSED - (Her New Joint Account is Displayed) - "+ updatedCardInfo);
                    break;
                }else {
                    System.out.println("TC3 FAILED - (Updated Card Info is Not Displayed)");
                }
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(1000);
        driver.close();

	}
}
