package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main (String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addButton.click();
        Thread.sleep(2000);

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick = 'deleteElement()']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed.");
        }else System.out.println("Delete button is not displayed");
        Thread.sleep(2000);

        //Delete butonuna basin
        deleteButton.click();
        Thread.sleep(2000);

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement =driver.findElement(By.cssSelector("h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Element is displayed.");
        }else System.out.println("Add/Remove Element is not displayed.");
        Thread.sleep(2000);

        //Sayfayı kapatın
        driver.close();



        /*
        Xpath ve CssSelector arasindaki farklar:

        -Xpath text ile calisir, cssSelector text ile calismaz.
        -Xpath index e gore arama yapabilir. Daha fazla kombinasyona sahiptir.
        CssSelector index'e gore arama yapamaz.
        -CssSelector Xpath ten daha hizli calisir.
         */













    }
}
