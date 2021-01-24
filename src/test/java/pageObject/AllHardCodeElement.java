package pageObject;

import base.Config;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AllHardCodeElement extends Config {

    Faker  faker= new Faker();

    public AllHardCodeElement (WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;


    }
    //Elements
//    @FindBy( how= How.NAME,using = "firs_tName")
//    public WebElement firstName;
//   @FindBy(how=How.NAME,using = "last_Name")
//   public WebElement lastName;
//    @FindBy( how= How.NAME,using = "email")
//    public WebElement email;
//    @FindBy( how= How.NAME,using = "password")
//    public WebElement password;
//    @FindBy( how= How.NAME,using = "confirm_password")
//    public WebElement confirmpassword;


    @FindBy( how= How.NAME,using = "email")
    public WebElement email;

    @FindBy(how= How.NAME,using = "pass")
    public WebElement password;

    @FindBy(how=How.NAME,using = "login")
    public WebElement login;


    public void goToSignUpPage(){
     String getCurrentUrl = driver.getCurrentUrl();
        String    SignUpPageUrl= getCurrentUrl + " home/signup";
        System.out.println( "SignUpPageUrl");
        driver.get(SignUpPageUrl);

    }

public void enterEmail(){
        email.sendKeys(faker.internet().safeEmailAddress());
//   email.sendKeys(faker.internet().safeEmailAddress());

}

public void enterPassword (){

    password.sendKeys("hossainbellal402@gmail.com");
}
public void enterLogIn(){
        login.click();
}
public void checkSuccessfulMsWithId(){
  String expected = "Thank  you for Sign In ";
  String actual = "The email or phone number you’ve entered doesn’t match any account.";
    Assert.assertEquals(actual, expected);
}

}
