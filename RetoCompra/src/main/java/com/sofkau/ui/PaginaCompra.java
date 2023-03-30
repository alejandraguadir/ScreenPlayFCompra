package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {
    public static final Target BOTON_CATEGORIAS = Target.the("Categorias")
            .located(By.xpath("//input[@id='testId-SearchBar-Input']"));
    public static final Target BUSCAR = Target.the("Categoria decohogar")
            .located(By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button"));

    public static final Target ORDENAR_POR = Target.the("menu menor precio")
            .located(By.xpath("(//button[@id='testId-Dropdown-desktop-button'])[1]"));
    public static final Target PRECIO_MENOR = Target.the("opcion menor precio")
            .located(By.xpath("//button[@id='testId-Dropdown-Precio de mayor a menor']"));
    public static final Target PRODUCTO = Target.the("producto")
            .located(By.xpath("(//li[@class='jsx-4179441773 prices-0'])[1]"));



    public static final Target AGREGAR_PRODUCTO = Target.the("button agregar a la bolsa")
            .located(By.xpath("(//button[normalize-space()='Agregar a la Bolsa'])[1]"));
    public static final Target VER_COMPRAS = Target.the("button agregar a la bolsa")
            .located(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[3]/div[2]/div"));

    public static final Target CONTINUAR_COMPRA = Target.the("button agregar a la bolsa")
            .located(By.xpath("//*[@id=\"order-cell\"]/div[2]/div/button"));
    public static final Target IR_PAGAR = Target.the("button agregar a la bolsa")
            .located(By.xpath("//*[@id=\"testId-ContinueShopping-enabled\"]\n"));


    public static final Target PAGO_EFECTY = Target.the("button agregar a la bolsa")
            .located(By.xpath(" //*[@id=\"__next\"]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[6]/div/div/div"));


}
