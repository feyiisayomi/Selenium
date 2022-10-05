package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class sortby {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Television");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        //statement to filter television by brand (Samsung)
        driver.findElement(By.xpath("//li[@id='p_89/Samsung']//i[@class='a-icon a-icon-checkbox']")).click();
        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
        driver.findElement(By.xpath("//a[@id='s-result-sort-select_2']")).click();
        Thread.sleep(2000);

        //List to store all element with classname "a-price-whole"
        List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
        //statement to click the element on index 2 (Third most expensive tv)
        prices.get(2).click();

        //For statement to iterate through list of web elements
//        for(int x=0; x< prices.size();x++){
//          System.out.println(prices.get(x).getText());
//        }
//        for(WebElement i: prices)
//        {
//            i
//            System.out.println(i.getText());
//        }
    }

}

