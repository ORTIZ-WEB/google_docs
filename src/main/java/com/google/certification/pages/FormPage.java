package com.google.certification.pages;

import com.google.certification.constants.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constants.Url_PrincipalPage)

public class FormPage extends PageObject {
    public static Target txt_name = Target.the("").located(By.xpath("//input[@aria-labelledby='i1']"));
    public static Target select_age = Target.the("").locatedBy("//div[@aria-labelledby='i5']");
    public static Target option_age = Target.the("").locatedBy("//div[@data-value='{0}' and @role='option']");
    public static Target select_gender = Target.the("").locatedBy("//div[@data-value='{0}']");
    public static Target txt_address = Target.the("").located(By.xpath("//input[@aria-labelledby='i25']"));
    public static Target txt_email = Target.the("").located(By.xpath("//input[@aria-labelledby='i29']"));
    public static Target txt_cel = Target.the("").located(By.xpath("//input[@aria-labelledby='i33']"));
    public static Target select_job_role = Target.the("").locatedBy("//div[@data-answer-value='{0}']");
    public static Target btn_submit = Target.the("").located(By.xpath("//div[@role='button' and @jsname='M2UYVd']"));
}
