package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {

    public static final Target PRODUCTO = Target.the("producto")
            .located(By.xpath("(//li[@class='jsx-4179441773 prices-0'])[1]"));
    public static final Target AGREGAR_PRODUCTO = Target.the("button agregar a la bolsa")
            .located(By.xpath("(//button[normalize-space()='Agregar a la Bolsa'])[1]"));
    public static final Target VER_COMPRAS = Target.the("ver bolsa de compras")
            .located(By.xpath("(//a[normalize-space()='Ver Bolsa de Compras'])[1]"));
    public static final Target CONTINUAR_COMPRA = Target.the("button continuar compra")
            .located(By.xpath("(//button[normalize-space()='Continuar compra'])[1]"));
    public static final Target IR_PAGAR = Target.the("button ir a pagar")
            .located(By.xpath("(//button[normalize-space()='Ir a pagar'])[1]"));
    public static final Target PAGO_EFECTY = Target.the("button pago efecty")
            .located(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[6]/div/div/div"));



}
