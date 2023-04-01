package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaCompra.*;



public class SeleccionaProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ORDENAR_POR, isPresent()),
                WaitUntil.the(ORDENAR_POR, isCurrentlyVisible()),
                WaitUntil.the(ORDENAR_POR, isCurrentlyEnabled()),
                WaitUntil.the(ORDENAR_POR,isClickable()),
                Click.on(ORDENAR_POR),

                WaitUntil.the(PRECIO_MENOR, isPresent()),
                WaitUntil.the(PRECIO_MENOR, isCurrentlyVisible()),
                WaitUntil.the(PRECIO_MENOR, isCurrentlyEnabled()),
                WaitUntil.the(PRECIO_MENOR,isClickable()),
                Click.on(PRECIO_MENOR),

                WaitUntil.the(PRODUCTO, isPresent()),
                WaitUntil.the(PRODUCTO, isCurrentlyVisible()),
                WaitUntil.the(PRODUCTO, isCurrentlyEnabled()),
                WaitUntil.the(PRODUCTO,isClickable()),
                Click.on(PRODUCTO),


                WaitUntil.the(AGREGAR_PRODUCTO, isPresent()),
                WaitUntil.the(AGREGAR_PRODUCTO, isCurrentlyVisible()),
                WaitUntil.the(AGREGAR_PRODUCTO, isCurrentlyEnabled()),
                WaitUntil.the(AGREGAR_PRODUCTO,isClickable()),
                Click.on(AGREGAR_PRODUCTO)

        );
    }

    public static SeleccionaProducto seleccionaProducto() {
        return new SeleccionaProducto();
    }
}



