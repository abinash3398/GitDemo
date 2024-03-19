package Qspiderselenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mcaffee {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://www.mcafee.com/blogs/internet-security/what-are-the-risks-of-clicking-on-malicious-links/");
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.cssSelector("a[data-navelement='WhyMcAfee']")).sendKeys(clickonlink);
		Set<String> ids = driver.getWindowHandles();
		String childid = "";
		for (String wid : ids) {
			System.out.println(wid);
			if (parentid.equals(wid)) {
				parentid = wid;
			} else {
				childid = wid;
				driver.switchTo().window(childid);
				break;
			}
			driver.close();
		}
	}
}
