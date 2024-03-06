import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       
       //dropdown with select tag 
       WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       
       Select drop=new Select(dropdown);
	 //drop.deselectByIndex(3);
	 System.out.println(drop.getFirstSelectedOption().getText());
	 drop.selectByVisibleText("AED");
	}

}
