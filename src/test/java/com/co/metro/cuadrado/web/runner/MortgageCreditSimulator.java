package com.co.metro.cuadrado.web.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/mortgage_credit_simulator.feature",
        glue = "com.co.metro.cuadrado.web"
)
public class MortgageCreditSimulator {
}
