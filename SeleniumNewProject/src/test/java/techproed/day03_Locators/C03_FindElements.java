package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com ");

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linklerListesi  = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi : " + linklerListesi.size());

        // Linkleri konsolda yazdırın
        for (WebElement each : linklerListesi) {
        if (!each.getText().isEmpty()){
            System.out.println(each.getText());
          }
        }

        //Lambda ile yazdir
        /*
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty()){
            System.out.println(link.getText());}
        });
         */

        // sayfayı kapatın
        driver.close();

        //ODEV1
        //Amazon sayfasına gidiniz
        //iphone aratınız
        //çıkan sonuç yazısını konsola yazdırınız
        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız

        //ODEV2
        //Techproeducation sayfasına gidelim
        //Çıkan reklamı locate edip kapatalım
        //Arama bölümünde qa aratalım
        //Sayfa başlığının qa içerdiğini doğrulayalım
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        //Carrer Opportunities In QA linkine tıklayalım
        //Başlığın Opportunities içerdiğini test edelim
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım


        //ODEV1 CEVAP
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //çıkan sonuç yazısını konsola yazdırınız
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = "+sonucSayisi[2]);
        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        for (int i = 0; i < 5 ; i++) {
            List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
            Thread.sleep(2000);
            urunler.get(i).click();
            Thread.sleep(2000);
            System.out.println((i+1)+". Urun basligi : "+driver.getTitle());
            driver.navigate().back();
            Thread.sleep(2000);
        }
        driver.close();
    }
}
