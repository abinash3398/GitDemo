package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyna1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	   // Thread.sleep(3000);
	 //driver.findElement(By.xpath("//a[@value='MAA']")).click();
driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
	}

}
