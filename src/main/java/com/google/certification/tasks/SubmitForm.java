package com.google.certification.tasks;

import com.google.certification.pages.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubmitForm implements Task {
    private List<Map<String, String>> datos;

    public SubmitForm(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> Userdata : datos) {
            actor.attemptsTo(
                    Enter.theValue(Userdata.get("name")).into(FormPage.txt_name),
                    Click.on(FormPage.select_age),
                    Click.on(FormPage.option_age.of(Userdata.get("age"))),
                    Click.on(FormPage.select_gender.of(Userdata.get("gender"))),
                    Enter.theValue(Userdata.get("address")).into(FormPage.txt_address),
                    Enter.theValue(Userdata.get("email")).into(FormPage.txt_email),
                    Enter.theValue(Userdata.get("cel")).into(FormPage.txt_cel),
                    Click.on(FormPage.select_job_role.of(Userdata.get("role"))),
                    Click.on(FormPage.btn_submit)
            );
        }
    }

    public static SubmitForm fillsfields(List<Map<String, String>> datos) {
        return instrumented(SubmitForm.class, datos);
    }

}
