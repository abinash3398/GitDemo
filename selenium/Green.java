package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        String[ ] item= {"Cucumber","Brocolli"};
		for(int i=0 ; i<products.size() ; i++)
       {
    	   String name=products.get(i).getText();
    	List<String> itemList=Arrays.asList(item);
    	   if(itemList.contains(name));
    	   {
    		   driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    		  // break;
    	   }
       }
	}

}
