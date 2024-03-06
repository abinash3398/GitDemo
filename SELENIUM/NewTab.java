
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.switchTo().newWindow(WindowType.TAB);
	 Set<String>handles= driver.getWindowHandles();
java.util.Iterator<String> itr=handles.iterator();
@SuppressWarnings("unused")
String parentWindow=itr.next();
String childWindow=itr.next();
driver.switchTo().window(childWindow);
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

	}

}

