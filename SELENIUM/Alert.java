import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.id("name")).sendKeys("abi");
		// driver.findElement(By.cssSelector("#alertbtn")).click();

		// System.out.println(driver.switchTo().alert().getText());

		// driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("dash");
		driver.findElement(By.xpath("//input[@class='btn-style']")).click();
		driver.switchTo().alert().dismiss();

	}

}
