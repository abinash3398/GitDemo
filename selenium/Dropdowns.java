package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//drop down with select tag
        
		WebElement staticDrop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop=new Select(staticDrop);	
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
	}

}
