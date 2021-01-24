package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AllHardCodeElement;

public class login_steps extends Config {

    AllHardCodeElement login = new AllHardCodeElement();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
login.goToSignUpPage();
      // System.out.println("Inside step-user is on login page");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
login.enterEmail();
login.enterPassword();
        //System.out.println("Inside step- user enters username and password");

    }

    @And("click on login button")
    public void clickOnLoginButton() {
login.enterLogIn();
       // System.out.println("Inside step-click on login button");
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {

       // System.out.println("Inside step-user navitgated to the home page");
    }



}
