package GOOGLE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class My_List_example {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement Searchbox= driver.findElement(By.xpath("//input[@name='q']"));
        Searchbox.sendKeys("cabin");
        Searchbox.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//div[@class='MUFPAc']/div[2]/a")).click();
        List<WebElement> pics = driver.findElements(By.xpath("//*[@class='fxgdke ZoQenf YnbWod']"));
        System.out.println(pics.size());
        pics.get(3).click();

    }
}
