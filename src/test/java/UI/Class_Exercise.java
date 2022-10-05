package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Exercise {

    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://qatechhub.com");
        driver.manage().window().maximize();
        String title = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
        if(title.equals(driver.getTitle()))
        {
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }

}
