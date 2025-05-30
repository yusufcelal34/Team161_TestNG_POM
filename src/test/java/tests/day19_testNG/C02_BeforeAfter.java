package tests.day19_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BeforeAfter {

     WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();

    }

    @Test
    public void aramaTesti(){
        System.out.println("Test 01 calisti");
    }

    @Test
    public void test02(){
        System.out.println("Test 02 calisti");
    }
}

