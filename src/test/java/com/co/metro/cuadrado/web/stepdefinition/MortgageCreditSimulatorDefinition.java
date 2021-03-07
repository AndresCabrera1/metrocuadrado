package com.co.metro.cuadrado.web.stepdefinition;

import com.co.metro.cuadrado.web.question.ConfirmCredit;
import com.co.metro.cuadrado.web.task.EnterTheModuleSimulateCredit;
import com.co.metro.cuadrado.web.task.StartWeb;
import com.co.metro.cuadrado.web.task.SetInformationForSimulatorOfCredit;
import com.co.metro.cuadrado.web.userinterface.UrlInicioWeb;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MortgageCreditSimulatorDefinition {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }


    @Dado("que ana ingresa al portal web metrocuadrado.com")
    public void que_ana_ingresa_al_portal_web_metrocuadrado_com() {
        theActorCalled("ana").attemptsTo(
                StartWeb.openUrl(UrlInicioWeb.UrlInicio));
    }

    @Cuando("ingresa su salario {int} mensual y el {int}")
    public void ingresa_su_salario_cop_mensual(int cop, int plazo) {
        theActorInTheSpotlight().attemptsTo(
                EnterTheModuleSimulateCredit.mortgage(),
                SetInformationForSimulatorOfCredit.mortgage().bySalary(String.valueOf(cop)).anYears(String.valueOf(plazo)));
    }

    @Entonces("confirma el monto que un banco le puede prestar")
    public void confirma_el_monto_que_un_banco_le_puede_prestar() {
        theActorInTheSpotlight().should(seeThat(ConfirmCredit.theUser(),is(true)).because("%s confirma los datos del credito %s"));
    }

}
