package com.co.metro.cuadrado.web.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BTNSELECTTOOLS = Target.the(" Selecciona el ingreso a Herramientas").located(By.xpath("(//a[contains(text(),'Herramientas')])[1]"));
    public static final Target BTNHOUSINGMOTGAGECALCULATOR = Target.the(" Selecciona el ingreso al modulo de calculadora credito hipotecario vivienda ").located(By.xpath("(//a[@href='/calculadora-credito-hipotecario-vivienda/'])"));
}


