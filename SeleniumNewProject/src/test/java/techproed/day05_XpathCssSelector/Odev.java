package techproed.day05_XpathCssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        ÖDEV3
         // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
         // Add Element butonuna 100 defa basınız
         // 100 defa basıldığını test ediniz
         // 90 defa delete butonuna basınız
         // 90 defa basıldığını doğrulayınız
         // Sayfayı kapatınız
         */


    }
}
