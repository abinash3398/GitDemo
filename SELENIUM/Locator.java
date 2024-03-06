import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
	//invoke browser
		WebDriver driver=new ChromeDriver();
   //using locators to find elements on a webpage
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.id("inputUsername")).sendKeys("hello");
	 driver.findElement(By.name("inputPassword")).sendKeys("pass");
	 driver.findElement(By.className("signInBtn")).click();
	System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
   	 driver.findElement(By.linkText("Forgot your password?")).click();
   	 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
     driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
     driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("johnyyboi@gamil.com");
     driver.findElement(By.xpath("//form/input[2]")).sendKeys("22929");
     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    
     System.out.println(driver.findElement(By.cssSelector("form p")).getText());
     driver.findElement(By.className("go-to-login-btn")).click();
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
   
     driver.findElement(By.cssSelector(".signInBtn")).click();
     
	}

}
