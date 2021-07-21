package com.google.certification.tasks;

import com.google.certification.pages.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class OpenTheAplication implements Task {

     FormPage principalPage;

    @Step("{0} opens the aplication")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(principalPage)
        );
    }
}
