package com.class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class HW1 extends CommonMethods {
	/*TC 1: Delete Employee
	 * 1.Open chrome browser
	 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * 3.Login into the application
	 * 4.Add Employee
	 * 5.Verify Employee has been added
	 * 6.Go to Employee List
	 * 7.Delete added Employee
	 * 8.Quit the browser */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		//login into HRMS
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//navigate to add Employee
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(500);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));
		//adding employee
		String f="Kemal";
		String l="Sunal";
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(f);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(l);
		driver.findElement(By.className("formInputText valid")).sendKeys("2020");
		
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		//verify employee was added
		String empDetail=driver.findElement(By.id("profile-pic")).getText();
		if(empDetail.equals(f+" "+l)){
			System.out.println("Employee was added succerful");
		}else {
			System.out.println("Employee NOT added");
		}
		
		//NAVOGATE TO EMPLOYEE LIST
		driver.findElement(By.linkText("Employee List")).click();
		//Get the first table from the employee list
		boolean found=false;
		while(!found) {
		List<WebElement> rowsF=driver.findElements(By.xpath("//table[@id='resultTable']/tbody//tr/td"));
			for (int i = 1; i < rowsF.size(); i++) {
				//get from text each row
				String rowsText=rowsF.get(i-1).getText();
				//verify if row contains employee id
					if(rowsText.contains(empId)) {
						//change the flag variable
						found=true;
						//deleting an employee
						driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));
						Thread.sleep(2000);
						driver.findElement(By.id("btnDelete")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("dialogDeleteBtn")).click();
						break;
					}
				}
					driver.findElement(By.xpath("//a[text()='Next']")).click();
			}
	Thread.sleep(5000);
	driver.quit();
	}

}
