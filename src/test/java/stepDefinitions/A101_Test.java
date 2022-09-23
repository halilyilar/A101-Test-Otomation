package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;


public class A101_Test {

    Driver driver;

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("a101"));
        WebElement cookiebuton = Driver.getDriver().findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cookiebuton.click();

        WebElement giyimtitle = Driver.getDriver().findElement(By.xpath("(//a[@title='GİYİM & AKSESUAR'])[1]"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", giyimtitle);;

        jse.executeScript("window.scrollBy(0,250)");
        WebElement kadınİçGiyim = Driver.getDriver().findElement(By.xpath("//a[text()='Kadın İç Giyim']"));
        jse.executeScript("arguments[0].click();", kadınİçGiyim);

        WebElement dizalticoraptitle = Driver.getDriver().findElement(By.xpath("//a[text()='Dizaltı Çorap']"));
        jse.executeScript("arguments[0].click();", dizalticoraptitle);

        WebElement dizaltısiyah = Driver.getDriver().findElement(By.xpath("(//a[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[1]"));
        //(//h3[@class='name'])[10]


        System.out.println(dizaltısiyah.getText());
        System.out.println(dizaltısiyah.getText().contains("Siyah"));
        Assert.assertTrue(dizaltısiyah.getText().contains("Siyah"));
        WebElement biradetekle = Driver.getDriver().findElement(By.xpath("(//span[@class='hidden-mobile'])[1]"));
        biradetekle.click();

        WebElement sepeteekle = Driver.getDriver().findElement(By.xpath("//button[@data-pk='18864']"));
        sepeteekle.click();
        //a[@class='go-to-shop']

        WebElement sepetgoruntule=Driver.getDriver().findElement(By.xpath("(//a[@title='Sepeti Görüntüle'])[2]"));
        sepetgoruntule.click();

        WebElement sepetonay = Driver.getDriver().findElement(By.xpath("(//a[@title='Sepeti Onayla'])[2]"));
        sepetonay.click();

        WebElement uyeolmadevam = Driver.getDriver().findElement(By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']"));
        uyeolmadevam.click();

        WebElement emailbox = Driver.getDriver().findElement(By.xpath("//input[@name='user_email']"));
        emailbox.click();
        emailbox.sendKeys("halil.yilarr@gmail.com");

        WebElement devamet = Driver.getDriver().findElement(By.xpath("//button[@class='button block green']"));
        devamet.click();

        WebElement yeniadresolustur = Driver.getDriver().findElement(By.xpath("(//a[@title='Yeni adres oluştur'])[1]"));
        yeniadresolustur.click();

        WebElement adresbox = Driver.getDriver().findElement(By.xpath("//input[@name='title']"));
        adresbox.click();

        Actions action = new Actions(Driver.getDriver());
        action.click(adresbox)
                .sendKeys("ev adresim")
                .sendKeys(Keys.TAB)
                .sendKeys("halil")
                .sendKeys(Keys.TAB)
                .sendKeys("Yılar")
                .sendKeys(Keys.TAB)
                .sendKeys("2345434343").perform();


        WebElement city = Driver.getDriver().findElement(By.xpath("//select[@name='city']"));
        Select select = new Select(city);
        select.selectByIndex(30);



        //select[@name='township']
        WebElement ilcedropbox = Driver.getDriver().findElement(By.xpath("//select[@name='township']"));
        Select select1 = new Select(ilcedropbox);
        select1.selectByIndex(4);

        WebElement mahalledropbox = Driver.getDriver().findElement(By.xpath("//select[@class='js-district']"));
        Select select2 = new Select(mahalledropbox);
        WebElement element=Driver.getDriver().findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[4]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.click(mahalledropbox).click(element).perform();


       ;
        //jse.executeScript("arguments[0].click();",  element);
        //System.out.println(element.getText());







        //*[@id="js-orders-modal-container"]/div/div[2]/form/div[6]/label/div/select/option[4]






        //select[@class='js-district']


        }


    }

