import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 WebElement fdriver=  driver.findElement(By.id("gf-BIG"));
	List<WebElement> count=  fdriver.findElements(By.tagName("a"));
	System.out.println(count.size());

}}
