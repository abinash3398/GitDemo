import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public final class RelativeLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
   	WebElement nameDriver= driver.findElement(By.className("form-control"));
System.out.println(driver.findElement(with(By.tagName("label")).above(nameDriver)).getText());
	}

}