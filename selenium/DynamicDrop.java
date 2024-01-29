package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		int i =1;
		while(i<5)
		{ 
			driver.findElement(By.id("hrefIncAdt")).click();
		i++;	
		}
     driver.findElement(By.cssSelector(".buttonN")).click();
     System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
	}

}
