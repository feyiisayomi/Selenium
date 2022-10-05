package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class timer_Alert {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("timerAlertButton")).click();
//        Using Explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());

        /**Using Fluent wait
         * Fluent wait is used when you don't know thw specific time a condition is expected to occur
         * For example if you have a Alert that sometimes show after 5 seconds, sometimes it shows after 10 second
         * other times it shows after 2 second. because its not consistent we can use fluent wait
         **/
        FluentWait wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(6));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoAlertPresentException.class);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        //driver.findElement(By.id("alertButton")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
    }
}
