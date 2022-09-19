package stepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;


public class A101_Test {

    Driver driver;

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("a101"));
        WebElement cookiebuton = Driver.getDriver().findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cookiebuton.click();

       WebElement giyimtitle = Driver.getDriver().findElement(By.xpath("(//a[@title='GİYİM & AKSESUAR'])[1]"));
       giyimtitle.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0,250)");

        WebElement kadınİçGiyim=Driver.getDriver().findElement(By.xpath("//a[text()='Kadın İç Giyim']"));
        jse.executeScript("arguments[0].click();", kadınİçGiyim);

         WebElement dizalticoraptitle=Driver.getDriver().findElement(By.xpath("//a[text()='Dizaltı Çorap']"));
        jse.executeScript("arguments[0].click();", dizalticoraptitle);

        WebElement dizaltısiyah=Driver.getDriver().findElement(By.xpath("(//h3[@class='name'])[7]"));
        System.out.println(dizaltısiyah.getText());
        System.out.println(dizaltısiyah.getText().contains("Siyah"));



    }
}