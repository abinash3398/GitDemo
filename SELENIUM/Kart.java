import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
for(WebElement prod:products)
{ 
	String name=((WebElement) prod).getText();
   
if(name.contains("Cucumber"))
    		  {	System.out.println(name);
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
 		  break;}
      }
		
		
		
		
		
	}

}
