package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odevler {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //ODEV1
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //iphone aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone");
        aramaKutusu.submit();

        //çıkan sonuç yazısını konsola yazdırınız
        System.out.println(driver.findElement(By.xpath("//*[text()='1-32 of 923 results for']")).getText());


        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        WebElement ilkResim = driver.findElements(By.className("s-image")).get(1);
        ilkResim.sendKeys("iphone" + Keys.ENTER);
        WebElement ilkResimBaslik = driver.findElements(By.id("title")).get(0);
        System.out.println(ilkResimBaslik.getText());

        //sayfayi kapatiniz
        driver.close();


    }
}
