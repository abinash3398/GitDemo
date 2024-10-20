package test.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class LinkCounts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(column.findElements(By.tagName("a")).size());
        int columnLinks=column.findElements(By.tagName("a")).size();

        for (int i = 0; i <columnLinks ; i++) {
            String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            column.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
        }
        Set<String> abc = driver.getWindowHandles();

        for (String s : abc) {

                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
            }

        driver.quit();

    }
}
