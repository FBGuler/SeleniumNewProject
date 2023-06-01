package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class CN01_Xpath {
    public static void main(String[] args) throws  InterruptedException{

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();

        // sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("//*[text()='14 results for']"));
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = " + sonucSayisi[0]);

        // ilk ürününe tıklayın
        //driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).click();
        // or
        driver.findElement(By.xpath("(//h2)[1]")).click();
        Thread.sleep(2000);

        // Sayfayı kapatınız
        driver.close();


















    }
}
