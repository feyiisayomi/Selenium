package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise_two {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("we have "+links.size()+" links on this page");

        for(int x = 0; x< links.size(); x++)
        {
            System.out.println("The Link text is : "+links.get(x).getText());
            System.out.println("The Link URL is : "+links.get(x).getAttribute("href"));

        }
//        for(WebElement element: links){
//
//            System.out.println("The Link Text is : "+element.getText());
//            System.out.println("The Link URL is : "+element.getAttribute("href"));
//        }
    }
}
