package com.co.metro.cuadrado.web.task;

import static com.co.metro.cuadrado.web.userinterface.Home.BTNHOUSINGMOTGAGECALCULATOR;
import static com.co.metro.cuadrado.web.userinterface.Home.BTNSELECTTOOLS;

import com.co.metro.cuadrado.web.interaction.TabBrowser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;



public class EnterTheModuleSimulateCredit implements Task {

    @Override
    @Step("{0} ingresa al modulo de Calculadora de crédito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTNSELECTTOOLS),
                Click.on(BTNHOUSINGMOTGAGECALCULATOR),
                TabBrowser.change());
    }

    public static Performable mortgage(){
        return Tasks.instrumented(EnterTheModuleSimulateCredit.class);
    }
}
