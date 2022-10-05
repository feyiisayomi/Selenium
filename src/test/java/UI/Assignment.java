package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
//        WebElement SearchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
//        SearchBox.sendKeys("Phone");
//        SearchBox.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Phone");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Samsung']")).click();
        driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__2\"]/ul/li[8]/div/a/div/span/input")).click();
        driver.findElement(By.xpath("//button[@aria-label='Sort selector. Best Match selected.']")).click();
        driver.findElement(By.xpath("//*[@id=\"s0-51-12-5-5[0]-36-1-content-menu\"]/li[5]/a")).click();

        //driver.findElement(By.xpath("//div[@title='4★ & above']//div[@class='_1Y4Vhm _4FO7b6']//div[1]")).click();
    }
}
