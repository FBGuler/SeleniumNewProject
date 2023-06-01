package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*

        Relative Locatiors

        - Bir web elementi direk locate edemedigimiz durumlarda,
        o web elementi etrafindaki web elementlerin referanci ile tarif etmemizi saglar.

        - Bir web sayfasinda benzer ozelliklere sahip webelementlerin oldugu durumlarda kullanilabilir.

        - above ==> belirtilen elementin ustunde olanelementi secer.
          below ==> belirtilen elementin altinda olan elementi secer.
          to_left_of ==> belirtilen elementin solunda olan elementi secer.
          to_right_of ==> belirtilen elementin saginda olan elementi secer.
          near ==> belirtilen elementin yaninda/yakininda olan elementi secer.

         */

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        Thread.sleep(2000);

        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text ()='hybrid bike']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("span")).above(hybridBikes));

        roadBikes.click();
        Thread.sleep(2000);

        // sayfayı kapatın
        driver.close();












    }
}
