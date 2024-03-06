import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
			}
public static void takeScreenshot(String filename)
{
 File file=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

}
}