package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static final Target MSJ_CONFIRMAR_COMPRA = Target.the("MSJ confirma compra")
            .located(By.xpath("(//span[@class='jsx-1790151645 body-copy-shade40-regular body-xs body-xl '])[1]"));

}
