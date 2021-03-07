package com.co.metro.cuadrado.web.task;

import com.co.metro.cuadrado.web.userinterface.UrlInicioWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class StartWeb implements Task {

    private final UrlInicioWeb urlHome;

    public StartWeb(UrlInicioWeb urlHome) {
        this.urlHome = urlHome;
    }

    @Override
    @Step("{0} ingresa a metrocuadrado.com  ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(urlHome.Url())
        );
    }
    public static Performable openUrl(UrlInicioWeb urlHome) {
        return Tasks.instrumented(StartWeb.class, urlHome);
    }
}
