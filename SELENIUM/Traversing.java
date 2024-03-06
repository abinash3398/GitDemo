import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println( driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		/* parent to child and child to parent traverse
		  note- this is only available in xpath but not for css
		 driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a"));
           */	
	}

}
