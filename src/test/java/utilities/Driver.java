package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver() {


     if (driver == null) {

         switch (ConfigReader.getProperty("browser")) {

             case "chrome" -> {
                 WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
             }
             case "edge" -> {
                 WebDriverManager.edgedriver().setup();
                 driver = new EdgeDriver();
             }
             default -> {
                 WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
             }
         }
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
            return driver;
        }
    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver=null;
        }

    }
}