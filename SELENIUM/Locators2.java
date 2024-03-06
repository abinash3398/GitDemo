import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		 driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String password=getpass(driver);
	
		  driver.findElement(By.className("go-to-login-btn")).click();
		  driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
			 Thread.sleep(2000);
			driver.findElement(By.cssSelector(".signInBtn")).click();
	     Thread.sleep(2000);
	   System.out.println( driver.findElement(By.tagName("p")).getText());
	  Assert.assertEquals( driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	    driver.findElement(By.className("logout-btn")).click();
	    driver.close();
	}
   
	public static String getpass(WebDriver driver) 
	{
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 String password=driver.findElement(By.cssSelector("form p")).getText();
		 String[] passarray=password.split("'");
		 String pass=passarray[1].split("'")[0];
	     return pass;
	}
	
	
}