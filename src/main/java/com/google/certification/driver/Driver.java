package com.google.certification.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {


    public static ChromeDriver chromeDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--start-incognito");

        return new ChromeDriver(options);
    }

    public static Performable toFrame(int index) {
        return new DriverTask(webDriver -> webDriver.switchTo().frame(index));
    }
}

