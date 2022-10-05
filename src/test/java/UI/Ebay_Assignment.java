package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Ebay_Assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
//        WebElement Searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
//        Searchbox.sendKeys("Phone");
//        Searchbox.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Phone");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Samsung']")).click();
        driver.findElement(By.xpath("//input[@aria-label='8 GB']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Sort selector. Best Match selected.']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Price + Shipping: highest first']")).click();
        Thread.sleep(2000);
        List<WebElement> product = driver.findElements(By.className("s-item__title"));
        System.out.println(product.size());
        List<WebElement> productName = driver.findElements(By.xpath("//span[@aria-level ='3']"));
        System.out.println(productName.get(2).getText());
        productName.get(2).click();

    }

}
