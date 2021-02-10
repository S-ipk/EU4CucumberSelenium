package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates Fleet, Vehicles")
    public void the_user_navigates_Fleet_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates Fleet, Vehicles");

    }

    @Then("the user should be see Vehicles page title")
    public void the_user_should_be_see_Vehicles_page_title() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user choose Marketing,Campaigns")
    public void the_user_choose_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user choose Marketing,Campaigns");

    }

    @Then("the user should be see Campaigns page title")
    public void the_user_should_be_see_Campaigns_page_title() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user choose Activities,Calendar Events")
    public void the_user_choose_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user choose Activities,Calendar Events");

    }

    @Then("the user should be see Calendars page title")
    public void the_user_should_be_see_Calendars_page_title() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab,module);

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {

        BrowserUtils.waitFor(5);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);

    }






}
