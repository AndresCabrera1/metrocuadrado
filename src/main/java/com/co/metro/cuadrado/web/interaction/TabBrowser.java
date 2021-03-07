package com.co.metro.cuadrado.web.interaction;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.Set;

public class TabBrowser implements Interaction {
    @Step("{0} cambia de pestana en el navegador web")
    public <T extends Actor> void performAs(T actor) {
        Set<String> setVentanas = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
        setVentanas.remove(Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle());
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().window((String)setVentanas.iterator().next());
    }

    public static Interaction change() {
        return  Tasks.instrumented(TabBrowser.class);
    }

}
