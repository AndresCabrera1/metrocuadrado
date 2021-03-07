package com.co.metro.cuadrado.web.task;

import static com.co.metro.cuadrado.web.userinterface.Candidatos.BTNCALCULATECREDIT;
import static com.co.metro.cuadrado.web.userinterface.Candidatos.OPTTERMINYEARS;
import static com.co.metro.cuadrado.web.userinterface.Candidatos.TXTDATATABLERESULT;
import static com.co.metro.cuadrado.web.userinterface.Candidatos.TXTMONTHLYINCOME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.co.metro.cuadrado.web.interaction.GetText;
import com.co.metro.cuadrado.web.interaction.ScrollPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;


public class SetInformationForSimulatorOfCredit implements Task {

    private String salary;
    private String years;

    @Override
    @Step("{0} ingresa la informacion para obtener el valor del prestamos ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollPage.scroll(BTNCALCULATECREDIT),
                SendKeys.of(salary).into(TXTMONTHLYINCOME),
                Click.on(OPTTERMINYEARS.of(years)),
                Click.on(BTNCALCULATECREDIT),
                WaitUntil.the(TXTDATATABLERESULT, isVisible()),
                GetText.by(TXTDATATABLERESULT).variable("DATA_RESULT_CALCULATOR")
        );
    }

    public static SetInformationForSimulatorOfCredit mortgage(){
        return Tasks.instrumented(SetInformationForSimulatorOfCredit.class);
    }

    public SetInformationForSimulatorOfCredit bySalary(String salary){
        this.salary= salary;
        return this;
    }

    public SetInformationForSimulatorOfCredit anYears(String years){
        this.years= years;
        return this;
    }
}
