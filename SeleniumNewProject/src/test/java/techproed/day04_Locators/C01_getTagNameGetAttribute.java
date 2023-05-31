package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // sayfasina gidiniz
        driver.get("https://www.amazon.com/");

        //arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName inin "input" old test edin
        String expected = "input";
        String actual = aramaKutusu.getTagName(); //tagName() methodu ile tagName ine ulasiyoruz
        if (actual.equals(expected)){
            System.out.println("Test passed!");
        }else System.out.println("Test failed!");

        //arama kutusunun name attribute nun degerinin "field-keywords" oldugunda test edin
        String actualAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("passed!");
        }else System.out.println("failed!");

        //sayfayi kapatin
        driver.close();

        /*
        Sorumuza gore arama kutusunu locate ettik. HTML kodlari icinde id, class, label, type gibi attribute'lerin
oldugunu gorduk. Biz id oldugunu gordugumuz ve id uniqe oldugundan id attribute'ni alamaya karar verdik.
Biz bir webelement'i locate etmek istiyorsak bu unique olmali. id attribute'nin degeri ve for attribute'nin
degerleri ayni yani twotabsearchtextbox. Bunun uzerine baska id var mi? varsa onun degeri twotabsearchtextbox
var i diye baktik. Olmadigini buna gore bu degerin uniqe oldugunu anlamis olduk.For'un degerinin ayni olmasi bu degerin uniqe olmasina engel degil.
findElement'i By.id ile locate ettik. id value'sunun unique oldugunu anladik ve onu alip parantez
icerisine yerlestirdik. Unique olan element icin findElements degil finElement methodunu kullaniriz.
Bunu bir liste degil WebElement'e assign ederiz.
         */







    }
}
