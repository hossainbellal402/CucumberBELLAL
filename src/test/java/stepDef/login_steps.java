package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
    @Given("user is on login page")
    public void userIsOnLoginPage() {

       System.out.println("Inside step-user is on login page");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {

        System.out.println("Inside step- user enters username and password");

    }

    @And("click on login button")
    public void clickOnLoginButton() {

        System.out.println("Inside step-click on login button");
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {

        System.out.println("Inside step-user navitgated to the home page");
    }



}
