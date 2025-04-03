package stepDefinitions;

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
    
}
