import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/");
Actions a= new Actions(driver);
a.moveToElement(driver.findElement( By.linkText("Drag and Drop"))).click().build().perform();
a.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).build().perform();

	}

}
