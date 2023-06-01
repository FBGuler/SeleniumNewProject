package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class CN02_cssSelector {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
cssSelector ile xpath arasındaki farklar;
1- cssSelector de @ işareti ve // işaretleri kullanılmaz
2- xpath ile index alabiliriz ama cssSelector ile index alamayız
3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız
4- cssSelector xpath'e göre daha hızlı çalışır
 */


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(2000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test passed");
        }else System.out.println("Test failed");


        //Delete tusuna basin
        deleteButton.click();
        Thread.sleep(2000);

        //Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));
        if(addRemoveElement.isDisplayed()){
            System.out.println("Test passed");
        }else System.out.println("Test failed");

        //sayfayi kapatiniz
        driver.close();














    }
}
