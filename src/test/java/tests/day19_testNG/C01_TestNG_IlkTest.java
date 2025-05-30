package tests.day19_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_TestNG_IlkTest {

    @Test
    public void aramaTesti(){

// gerekli ayarlari yapin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

// phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

// arama sonucunda urun bulunabildigini test edin

        WebElement sonucYaziElementi = driver.findElement(By.id("global-count-text"));

        String unexpectedSonucYazisi = "0 pruduct found";
        String unexpectedYazisi = sonucYaziElementi.getText();

        Assert.assertNotEquals(unexpectedSonucYazisi, unexpectedYazisi);

// sayfayi kapatin
        driver.quit();



    }
}
