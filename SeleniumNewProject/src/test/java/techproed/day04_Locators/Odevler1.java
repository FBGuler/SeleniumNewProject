package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odevler1 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("WebDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //ODEV2
        //https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        Thread.sleep(2000);

        //Bir mail adersi giriniz
        WebElement mailEnter = driver.findElement(By.xpath("//div[@class='abineContentPanel']"));
        mailEnter.sendKeys("<banuguler@gmail.com>");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Reject All Cookies']")).click(); //reklami kadirmak icin



        //Bir password giriniz
        WebElement pswEnter = driver.findElement(By.xpath("//input[@class='form-control password']"));
        pswEnter.sendKeys("<12345678>");
        Thread.sleep(2000);

        //Login butonuna tiklayiniz
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        Thread.sleep(2000);

        //"There was a problem with your login." texti gorunur ise "kayit yapilamadi" yazdiriniz
        //eger yazi gorunur degilse "kayit yapildi" yazdiriniz

        String actualProblem = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        String expectedProblem = "There was a problem with your login.";
        if (expectedProblem.equals(actualProblem)){
            System.out.println("kayit yapilamadi");
        }else System.out.println("kayit yapildi" );

        //sayfayı kapatiniz
        driver.close();

    }
}
