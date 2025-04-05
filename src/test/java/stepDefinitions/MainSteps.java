package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    @Given("User is on Netbanking landing Page")
    public void user_is_on_netbanking()
    {
        System.out.println("user_is_on_netbanking");
    }

    @When("^User Login into Application with (.+) and password (.+)$")
    public void User_Login_into_Application(String user, String passowrd)
    {
        System.out.println("User_Login_into_Application" + user + passowrd);
    }

    @Then("Home Page is displayed")
    public void Home_Page_is_displayed()
    {
        System.out.println("Home_Page_is_displayed");
    }
    
    @And("Cards are displayed")
    public void Cards_are_displayed()
    {
        System.out.println("Cards_are_displayed");
    }

    @When("User Signup into Application")
    public void User_Signup_into_Application(List <String> data) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
    }

    @Given("connect database and set environment")
    public void connect_database_and_set_environment() {
        System.out.println("connected to db succesfully");
    }

    @When("connect driver and launch the brower")
    public void connect_driver() {
        System.out.println("bowser opened");
    }
    
}
