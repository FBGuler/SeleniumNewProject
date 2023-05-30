package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow  {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        //1.Yeni bir Class olusturalim.C06_ManageWindow
        //2.Amazon soyfasina gidelim. https://www.amazon.com/
        String amz ="https://www.amazon.com/";
        driver.get(amz);
        Thread.sleep(3000);

        //3.Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Page size : " + driver.manage().window().getSize());
        System.out.println("Page position : " + driver.manage().window().getPosition());

        //4.Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Page max size : " + driver.manage().window().getSize());
        System.out.println("Page max position : " + driver.manage().window().getPosition());

        //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Page fullscreen size : " + driver.manage().window().getSize());
        System.out.println("Page fullscreen position : " + driver.manage().window().getPosition());

        //9.Sayfayi kapatin
        driver.close();










    }
}
