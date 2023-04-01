package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaBuscarProducto extends PageObject {
    public static final Target BARRA_BUSQUEDA = Target.the("Categorias")
            .located(By.xpath("//input[@id='testId-SearchBar-Input']"));
    public static final Target LUPA_BUSCAR = Target.the("Categoria decohogar")
            .located(By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button"));
    public static final Target ORDENAR_POR = Target.the("menu menor precio")
            .located(By.xpath("(//button[@id='testId-Dropdown-desktop-button'])[1]"));
    public static final Target PRECIO_MENOR = Target.the("opcion los mejores evaluados")
            .located(By.xpath("//button[@id='testId-Dropdown-Los mejores evaluados']"));


}
