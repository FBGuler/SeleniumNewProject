package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


                //Amazon sayfasina gidelim. https://www.amazon.com/
                driver.get("https://www.amazon.com/");
                Thread.sleep(3000);

                //Sayfanin konumunu ve boyutlarini yazdirin
                System.out.println("Page Position : "+driver.manage().window().getPosition());
                System.out.println("Page Size: "+driver.manage().window().getSize());

                //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
                driver.manage().window().setPosition(new Point(60,0));
                Thread.sleep(3000);
                driver.manage().window().setSize(new Dimension(600,600));
                Thread.sleep(3000);

                //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

                System.out.println("Expected position = " + driver.manage().window().getPosition());
                System.out.println("Expected size = " + driver.manage().window().getSize());

                //Sayfayi kapatin
                driver.close();

            }
        }






