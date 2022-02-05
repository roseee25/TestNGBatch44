package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import javax.swing.*;

public class C02_MouseActions extends TestBase {

    // amazon anasayfaya gidin
    // sag uste hello, sigIn elementinin uzerinde mouse'u bekletin
    // acilan menude new list linkine tiklayin
    // ve nwe list sayfasinin acildigini test edin

    @Test
    public void amazonList() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement helloElement=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
        actions.moveToElement(helloElement).perform();
        WebElement listElementi=driver.findElement(By.xpath("//span[text()='Create a List']"));
        actions.click(listElementi).perform();
        String actualTitle=driver.getTitle();
        String arananMetin="Your List";
        Assert.assertTrue(actualTitle.contains(arananMetin));

    }

}
