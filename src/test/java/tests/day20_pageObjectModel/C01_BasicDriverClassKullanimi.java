package tests.day20_pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_BasicDriverClassKullanimi {

    @Test
    public void testOtomasyonuTesti() {

        // testotomasyonu anasayfaya gidin
        Driver.getDriver().get("https://www.testotomasyonu.com");

        // url'in testotomasyonu icerdigini test edin
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // sayfayi kapatin
        Driver.quitDriver();
    }

    @Test
    public void wiseOtomasyonuTesti() {

        // testotomasyonu anasayfaya gidin
        Driver.getDriver().get("https://www.wisequarter.com");

        // url'in wisequarter icerdigini test edin
        String expectedUrlIcerik = "wisequarter";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // sayfayi kapatin
        Driver.quitDriver();
    }

    @Test
    public void youtubeOtomasyonuTesti() {

        // youtube anasayfaya gidin
        Driver.getDriver().get("https://www.youtube.com");

        // url'in testotomasyonu icerdigini test edin
        String expectedUrlIcerik = "youtube";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // sayfayi kapatin
        Driver.quitDriver();
    }
}
