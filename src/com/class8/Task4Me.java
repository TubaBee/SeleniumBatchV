package com.class8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task4Me extends CommonMethods {
	/*TC 1: Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 4 rows and 5 columns
Print name of all column headers 
Print data of all rows
Quit Browser */
	public static void main(String[] args) {
		setUp("chrome", "http://166.62.36.207/syntaxpractice/");
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		//get Number of Rows from the table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		
		//Get Number of cols from the table
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		
		
		System.out.println("Number of rows = "+rows.size()+" and # of cols= "+ cols.size());
		
		System.out.println("Printing columns header--------------------------------------------------------");
		Iterator<WebElement> it=cols.iterator();
		while(it.hasNext()) {
			WebElement column=it.next();
			System.out.println(column.getText());
		}
		
		
		System.out.println("Printing rows header--------------------------------------------------------");
		for(WebElement row:rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		
		System.out.println("Printing data cell by cell using advanced for loop--------------------------------------------------------");
		/*//table[@class='table']/tbody/tr/td
		 * 1.//table[@class='table'] - table element
		 * 2./tbody - from table going inside tbody
		 * 3./tr - from tbody going into rows (not specific row)
		 * 4./td - going into table data --> cell
		 */
		
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		for (WebElement cellData : cells) {
			System.out.println(cellData.getText());
		}
		
		System.out.println("Printing data cell by cell using for loop-------------------------------");
		for (int i = 1; i < rows.size(); i++) {	//controling rows
			for(int y=1; y <cols.size(); y++) {	//controling columns
				WebElement cellText=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+y+"]"));
				System.out.println(cellText);
			}
			
		}
		
		driver.quit();
		
	}
}
