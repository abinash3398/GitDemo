


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ColumnScan {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
driver.findElement(By.id("search-field")).sendKeys("Rice");
String item= driver.findElement(By.xpath("//tr/td")).getText();
if(item.contains("Rice"))
{
	System.out.println("true");
Assert.assertEquals("Rice", item);
}
	}}
