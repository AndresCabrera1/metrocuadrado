package com.co.metro.cuadrado.web.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Candidatos {
    public static final Target TXTMONTHLYINCOME = Target.the(" ingresa el salario mensual  ").locatedBy(" (//input[@id='ingresosMensuales'])");
    public static final Target BTNCALCULATECREDIT= Target.the("Selecciona el calcular credito").located(By.xpath("//h4[contains(text(),'Calcular Crédito')]"));
    public static final Target OPTTERMINYEARS = Target.the(" Selecciona el plazo en anos  {0} ").locatedBy("(//option[contains(text(),'{0}')])[1]");
    public static final Target TXTDATATABLERESULT = Target.the(" visualiza la informacion esperada ").located(By.xpath("//dd[@class='ng-binding']"));

}
