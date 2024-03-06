import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkonNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 WebElement fdriver=  driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	List<WebElement> count=  fdriver.findElements(By.tagName("a"));
	//System.out.println(count.size());
	for(int i=0;i<count.size();i++)
	{
		String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	count.get(i).sendKeys(clickonlink);
	Thread.sleep(5000);
	}}}
