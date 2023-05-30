package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_Homework {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


       //Yeni bir class olusturalim (Homework)
       //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else System.out.println("Title : " + driver.getTitle());

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test passed");
        }else System.out.println("Actual URL : " + driver.getCurrentUrl());

       //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        Thread.sleep(3000);

       //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Walmart.com";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

       //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);

       //Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

       //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Browser’i kapatin
        driver.close();






    }
}
