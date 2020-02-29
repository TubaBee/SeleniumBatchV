package myWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Callender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		//login into HRMS
		d.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.linkText("Leave")).click();
		d.findElement(By.linkText("Leave List")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(1000);
		WebElement month=d.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(month);
		s.selectByIndex(3);
		
	
		Thread.sleep(1000);
		WebElement year=d.findElement(By.className("ui-datepicker-year"));
		Select y=new Select(year);
		y.selectByValue("1984");
		
		//year bolumunde kac tane secenek var bulur
		List<WebElement> op=y.getOptions();
		System.out.println(op.size());
				
		Thread.sleep(2000);
		List<WebElement> cells=d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement c:cells) {
			if(c.getText().equals("28")) {
				c.click();
				break;
			}
		}
		
//		Thread.sleep(7000);
//		d.quit();
	}
}
