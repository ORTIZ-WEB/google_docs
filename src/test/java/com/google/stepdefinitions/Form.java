package com.google.stepdefinitions;

import com.google.certification.driver.Driver;
import com.google.certification.tasks.OpenTheAplication;
import com.google.certification.tasks.SubmitForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Form {

    @Steps
    OpenTheAplication openTheAplication;

    @Before
    public static void before(){
        setTheStage(new OnlineCast());
        theActor("user");
    }

    @Given("^that the user want answer the form$")
    public void thatTheUserWantAnswer() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.chromeDriver()));
        theActorInTheSpotlight().wasAbleTo(openTheAplication);
    }

    @Given("^user enters data information$")
    public void userEntersDataInformation(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(SubmitForm.fillsfields(data));
    }
}
