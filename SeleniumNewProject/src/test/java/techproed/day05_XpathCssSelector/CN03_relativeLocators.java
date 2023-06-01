package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class CN03_relativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Benzer ozelliklere sahip webelementler icin relative locator kullanabiliriz.
        SYNTAX;
        driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi
        methodlar ile benzer ozelliklere sahip webelementleri location  almadan o web elemente ulasabiliriz
         */

        //Amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalim
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("city bike" + Keys.ENTER);

        //relative locator kullanarak hybrid bike altindaki elemente tiklayalim












    }
}
