package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Config {

   public static WebDriver driver;


    public static WebDriver initDriver(){
       //steup browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);






        return driver;



    }


}
