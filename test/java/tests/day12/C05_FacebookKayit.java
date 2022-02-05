package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_FacebookKayit extends TestBase {

    //Yeni bir class olusturalim: D15_MouseActions4

    @Test
    public void test01() throws InterruptedException {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.click(isimKutusu).
                sendKeys("elif").
                sendKeys(Keys.TAB).
                sendKeys("akar").
                sendKeys(Keys.TAB).
                sendKeys("abc@hotmail.com").
                sendKeys(Keys.TAB).
                sendKeys("abc@hotmail.com").
                sendKeys(Keys.TAB).
                sendKeys("Aa11s2345-").
                perform();
        //4- Kaydol tusuna basalim
        WebElement kaydolButonElementi = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        actions.click(kaydolButonElementi).perform();
        Thread.sleep(5000);
    }
}
