package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();
        /*
        Bir web sitesine gittigimizde browser default olarak bir boyutta gelir. Ve acilan browser'daki
        webElementler'e browser maximize olmadigi icin ulasamayabiliriz. Dolayisiyla browser'i actiktan
        sonra maximize yaparsak driver butun webElementleri gorur ve rahatlikla mudahale edebilir.
        Bu yuzden browser'i actiktan sonra ilk olarak driver.manage().window().maximize(); yapmamiz
        isimizi kolaylastirir. Boylelikle hata almamis oluruz.
         */

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//istedigimiz konuma getirir.
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);

        //sayfayi kapatiniz
        driver.close();

    }
}











