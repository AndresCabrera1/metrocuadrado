package com.co.metro.cuadrado.web.question;

import static com.co.metro.cuadrado.web.model.DataExpected.INCOME_BANK;
import static com.co.metro.cuadrado.web.model.DataExpected.MINIMUM_DOWN_PAYMENT;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;

import static com.co.metro.cuadrado.web.model.DataExpected.MONTHLY_INCOME;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import java.util.List;

@Subject("Confirma el ingreso mensual, lo que Un banco puede prestarle y la cuota inicial mínima")
public class ConfirmCredit implements Question<Boolean> {
    private final List<String> productList = sessionVariableCalled("DATA_RESULT_CALCULATOR");
    @Override
    public Boolean answeredBy(Actor actor) {
        return productList.get(0).replaceAll("\\D","").equals(MONTHLY_INCOME.getValue()) && productList.get(1).replaceAll("\\D","").equals(INCOME_BANK.getValue()) && productList.get(2).replaceAll("\\D","").equals(MINIMUM_DOWN_PAYMENT.getValue());
    }

    public static ConfirmCredit theUser(){
        return new ConfirmCredit();
    }
}
