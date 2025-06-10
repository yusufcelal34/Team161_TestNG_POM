package tests.day23_htmlReports_dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C05_TopluNegatifLoginTesti extends TestBaseRapor {

    @DataProvider
    public static Object[][] kullaniciBilgileriDataProvider() {

        String[][] kullaniciBilgileriArrayi = {{"yigit@kmail.com", "125687"},
                                                {"tugba@tmail.com", "345678"},
                                                {"yusuf@mmail.com", "456789"},
                                                {"sumeyra@smail.com", "342321"},
                                                {"acan@cmail.com", "987098"}};

        return kullaniciBilgileriArrayi;
    }

    // Verilen listedeki herbir Email-password ikilisi icin
    // asagidaki negatif login testini yapin
    // yigit@kmail.com   125687
    // tugba@tmail.com   345678
    // yusuf@mmail.com   456789
    // sumeyra@smail.com 342321
    // canan@cmail.com 987098

    @Test (dataProvider = "kullaniciBilgileriDataProvider")
    public void negatifLoginTesti(String verilenEmail, String verilenPassword){
        extentTest = extentReports.createTest("Data Provider","Email ve Password kontrol");

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        ReusableMethods.bekle(1);
        extentTest.info("Kullanici testotomasyonu anasayfaya gider");



        //2- account linkine basin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        ReusableMethods.bekle(2);
        testotomasyonuPage.accountLinki.click();
        extentTest.info("account linkine basar");


        //3- verilen email, verilen password ile giris yapmayi deneyin

        testotomasyonuPage.emailKutusu.sendKeys(verilenEmail);
        testotomasyonuPage.passwordKutusu.sendKeys(verilenPassword);
        extentTest.info("verilen email, verilen password ile giris yapmayi deneyin");


        //4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.loginButonu.click();
        ReusableMethods.bekle(1);
        extentTest.info("Login butonuna basarak login olmayi deneyin");


        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
        extentTest.pass("Basarili olarak giris yapilamadigini test edin");

        //6- Kapatma işlemi

    }
}