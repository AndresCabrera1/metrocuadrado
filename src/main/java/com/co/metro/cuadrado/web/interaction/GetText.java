package com.co.metro.cuadrado.web.interaction;

import static net.serenitybdd.core.Serenity.setSessionVariable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class GetText implements Interaction {
    private final Target target;
    private String nomVariable;

    public GetText(Target target) {
        this.target = target;
    }
    @Override
    @Step("{0} visualiza el texto en pantalla")
    public <T extends Actor> void performAs(T actor) {
     setSessionVariable(nomVariable).to(Text.of(target).viewedBy(actor).resolveAll());
    }

    public static GetText by(Target target) {
        return Tasks.instrumented(GetText.class, target);
    }

    public GetText variable(String nomVariable) {
        this.nomVariable = nomVariable;
        return this;
    }
}
