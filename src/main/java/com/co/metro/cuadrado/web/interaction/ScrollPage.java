package com.co.metro.cuadrado.web.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage implements Interaction {
    Target target;

    public ScrollPage(Target target) {
        this.target = target;
    }
    @Step("{0} se desplaza por la pagina")
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.moveToElement(this.target.resolveFor(actor).getElement());
        actions.perform();
    }

    public static Interaction scroll(Target target) {
        return Tasks.instrumented(ScrollPage.class, target);
    }
}