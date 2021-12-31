package KekaAttendance;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class TestConfig {
    WebDriver driver;
    TestDataExcel excel = new TestDataExcel("Data/Keka_TestData.xlsx");


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting TestConfig");
    }

    // In this ChromeBrowser method, all automatic script will be executed on chrome browser

    @Test
    public void ChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_linux64 (1)/chromedriver");

        // Headless Browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        // Launch Chrome
        driver = new ChromeDriver();

        // Maximize Window
        driver.manage().window().maximize();

        // Delete all Cookies
        driver.manage().deleteAllCookies();

        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        // Opening KEKA Website and locating all the elements

        driver.get("https://app.keka.com");
        driver.findElement(By.cssSelector("#email")).sendKeys(excel.getData(0, 0, 0));
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.cssSelector("body.nyoS7c.UzCXuf.EIlDfe:nth-child(2) div.H2SoFe.LZgQXe.TFhTPc:nth-child(1) div.RAYh1e.LZgQXe.qmmlRd div.xkfVF div.Aa1VU div.JhUD8d.SQNfcc.vLGJgb div.zWl5kd div.DRS7Fe.bxPAYd.k6Zj8d div.pwWryf.bxPAYd:nth-child(2) div.Wxwduf.Us7fWe.JhUD8d div.zQJV3 div.dG5hZc div.qhFLie div.FliLIb.DL0QTb div.VfPpkd-dgl2Hf-ppHlrf-sM5MNb button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b > span.VfPpkd-vQzf8d")).click();
        driver.findElement(By.name("password")).sendKeys(excel.getData(0, 0, 1));
        driver.findElement(By.id("passwordNext")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/div/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/xhr-app-root/div/employee-me/div/employee-attendance/div/div/div/div/employee-attendance-logs/div/employee-attendance-list-view/div/div[2]/div[1]/div/div[1]/div[2]/div/div[3]")).click();
        driver.findElement(By.xpath("/html/body/xhr-app-root/div/employee-me/div/employee-attendance/div/div/div/div/employee-attendance-logs/div/employee-attendance-list-view/div/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/div/div[1]/div[2]/input")).sendKeys("9:45");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/div/div[1]/div[3]/input")).sendKeys("18:45");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[3]/div/textarea")).sendKeys(excel.getData(0, 1, 0));

        // Request Button
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[3]/button[2]")).click();

    }


    // In this FirefoxBrowser method, all automatic script will be executed on Firefox browser

    @Test
    public void FirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/geckodriver-v0.30.0-linux64/geckodriver");

        // Headless Browser
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(options);

        // Launch Firefox
        driver = new FirefoxDriver();

        // Maximize Window
        driver.manage().window().maximize();

        // Delete all Cookies
        driver.manage().deleteAllCookies();

        // Waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        // Opening KEKA Website and locating all the elements

        driver.get("https://app.keka.com");
        driver.findElement(By.cssSelector("#email")).sendKeys(excel.getData(0, 0, 0));
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.cssSelector("body.nyoS7c.UzCXuf.EIlDfe:nth-child(2) div.H2SoFe.LZgQXe.TFhTPc:nth-child(1) div.RAYh1e.LZgQXe.qmmlRd div.xkfVF div.Aa1VU div.JhUD8d.SQNfcc.vLGJgb div.zWl5kd div.DRS7Fe.bxPAYd.k6Zj8d div.pwWryf.bxPAYd:nth-child(2) div.Wxwduf.Us7fWe.JhUD8d div.zQJV3 div.dG5hZc div.qhFLie div.FliLIb.DL0QTb div.VfPpkd-dgl2Hf-ppHlrf-sM5MNb button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b > span.VfPpkd-vQzf8d")).click();
        driver.findElement(By.name("password")).sendKeys(excel.getData(0, 0, 1));
        driver.findElement(By.id("passwordNext")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/div/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/xhr-app-root/div/employee-me/div/employee-attendance/div/div/div/div/employee-attendance-logs/div/employee-attendance-list-view/div/div[2]/div[1]/div/div[1]/div[2]/div/div[3]")).click();
        driver.findElement(By.xpath("/html/body/xhr-app-root/div/employee-me/div/employee-attendance/div/div/div/div/employee-attendance-logs/div/employee-attendance-list-view/div/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/div/div[1]/div[2]/input")).sendKeys("9:45");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div[1]/div/div/div/div[1]/div[3]/input")).sendKeys("18:45");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[3]/div/textarea")).sendKeys(excel.getData(0, 1, 0));

        //Request Button
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[3]/button[2]")).click();

    }


    @AfterMethod
    public void afterMethod() {
        driver.close();
        System.out.println("Finished TestConfig");
    }
}