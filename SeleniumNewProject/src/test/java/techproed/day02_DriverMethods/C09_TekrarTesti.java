package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_TekrarTesti {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını
        // doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verify");
        }else System.out.println(actualTitle);

        //Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "youtube";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Verified");
        }else System.out.println(actualUrl);


        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        //Youtube sayfasina geri donun.
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon=driver.getTitle();
        String expectedTitleAmazon="Amazon";
        if(actualTitle.contains(expectedTitleAmazon)){
            System.out.println("Verified");
        }else
            System.out.println(actualTitleAmazon);

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        //degilse doğru URL'yi yazdırın
        String actualUrlAmazon=driver.getCurrentUrl();
        String expectedUrlAmazon="https://www.amazon.com/";
        if(actualUrlAmazon.contains(expectedUrlAmazon)){
            System.out.println("Verified");
        }else
            System.out.println(actualUrlAmazon);

        //Sayfayi kapatin
        driver.close();
        Thread.sleep(3000);

        //Tum Sayfalari kapatin
        driver.quit();

    }
}
