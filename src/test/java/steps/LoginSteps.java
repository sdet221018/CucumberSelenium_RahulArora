package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user navigates to the facebook website")
    public void userNavigatesToTheFacebookWebsite() {
        System.out.println("@Given -- user navigates to the facebook website");
    }

    @When("user validates the homepage title")
    public void userValidatesTheHomepageTitle() {
        System.out.println("@When -- user validates the homepage title");
    }

    @Then("user enters {string} username")
    public void userEntersUsername(String username) {
        System.out.println("@Then -- user enters " + username + " username");
    }

    @And("user enters {string} password")
    public void userEntersPassword(String password) {
        System.out.println("@And -- user enters " + password + " password");
    }

    @And("user clicks on the sign-in button")
    public void userClicksOnTheSignInButton() {
        System.out.println("@And -- user clicks on the sign-in");
    }

    @Then("user {string} successfully logged in")
    public void user_successfully_logged_in(String string) {
        System.out.println("@Then -- user " + string + " successfully logged in\n\n");
    }

}
