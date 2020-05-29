package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PajeObjectPackage.Homepage;

public class HomepageStep {
    Homepage homepage = new Homepage();

    @Given("^user is on homepage of Gucci$")
    public void user_is_on_homepage_of_Gucci() throws Throwable {
    Thread.sleep(2000);
    homepage.cookieMethod();
    }

    @When("^user clicks on SHOP MEN$")
    public void user_clicks_on_SHOP_MEN() throws Throwable {
    Thread.sleep(2000);
    homepage.menMethod();
    }

    @Then("^user should be able to see all Men product$")
    public void user_should_be_able_to_see_all_Men_product() throws Throwable {
    Thread.sleep(2000);
    homepage.scrollMethod();
    }
}
