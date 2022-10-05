package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        //Code to get confirmation alert text
        System.out.println(driver.switchTo().alert().getText());
        //code to cancel confirmation alert
        driver.switchTo().alert().dismiss();
        //code to accept confirmation alert
        //driver.switchTo().alert().accept();
    }
}
