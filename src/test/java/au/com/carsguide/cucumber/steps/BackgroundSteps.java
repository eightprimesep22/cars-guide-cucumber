package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BackgroundSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().verifyHomePage();
    }

    @And("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String menuItem){
        new HomePage().selectFromMenu(menuItem);
    }


}
