package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //techproedication sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile ayni mantikla calisir.
        Thread.sleep(3000); //Java kodlarini bekletmek icin Thread.sleep() kullaniriz

        //Sonra amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfa basligi : " + driver.getTitle());
        Thread.sleep(3000);

        //techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //sayfa başlığını yazdıralım
        System.out.println("Techproeducation sayfa basligi : " + driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasına tekrar gidip url'i yazdırın
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Amazon URL yazdir : " + driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayi kapatalim
        driver.close();



    }
}
