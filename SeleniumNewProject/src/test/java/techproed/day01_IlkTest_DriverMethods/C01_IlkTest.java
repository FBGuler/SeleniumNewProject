package techproed.day01_IlkTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "value" ya ulasabilirim.
        WebDriver driver = new ChromeDriver();
        //ChromeDriver turunde yeni bir obje Olusturduk
        driver.get("https://techproeducation.com");
    }
}
