package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class BuscarProducto implements Task {
    private String producto;


    public BuscarProducto yProducto(String producto) {
        this.producto = producto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BARRA_BUSQUEDA, isPresent()),
                WaitUntil.the(BARRA_BUSQUEDA, isCurrentlyVisible()),
                WaitUntil.the(BARRA_BUSQUEDA, isCurrentlyEnabled()),
                WaitUntil.the(BARRA_BUSQUEDA,isClickable()),
                Scroll.to(BARRA_BUSQUEDA),
                Enter.theValue(producto).into(BARRA_BUSQUEDA),
                Click.on(LUPA_BUSCAR)


        );
    }

    public static BuscarProducto buscarProducto() {
        return new BuscarProducto();
    }
}



