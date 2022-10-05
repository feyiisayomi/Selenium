package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment_four {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//li[@aria-label='HP']/span/a")).click();
        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Price: Low to High']")).click();
        List<WebElement> products = driver.findElements(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]"));
        System.out.println(products.size());
        products.get(2).click();



    }
}
