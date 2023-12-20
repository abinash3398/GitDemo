package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("abinash3398@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("hello");
        driver.findElement(By.className("submit")).click();
       
        System.out.println( driver.findElement(By.cssSelector(".error")).getText());
        
        
       
        driver.findElement(By.linkText("Forgot your password?")).click();
	   
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@");
	    
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("39203893");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   System.out.print( driver.findElement(By.cssSelector(".infoMsg")).getText());
	   driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	   driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	   driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector("button[type='submit']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
	   driver.close();
	  
	  
	  
	
	}

}
