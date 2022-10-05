package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Priscas_request {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='New Releases']")).click();
        List<WebElement> NewRelprice = driver.findElements(By.className("_p13n-zg-list-carousel-desktop_price_p13n-sc-price__3mJ9Z"));
        System.out.println(NewRelprice.get(2).getText());
        NewRelprice.get(2).click();
        //driver.navigate().back();
        //Thread.sleep(2000);
        //driver.navigate().forward();
        driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]/span[1]")).click();


    }
}
