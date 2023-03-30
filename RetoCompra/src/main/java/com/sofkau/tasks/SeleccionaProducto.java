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
    private String producto;


    public SeleccionaProducto yProducto(String producto) {
        this.producto = producto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BARRA_BUSQUEDA,isClickable()),
                Scroll.to(BARRA_BUSQUEDA),
                Enter.theValue(producto).into(BARRA_BUSQUEDA),
                Click.on(LUPA_BUSCAR),
                WaitUntil.the(ORDENAR_POR,isClickable()),
                Click.on(ORDENAR_POR),
                WaitUntil.the(PRECIO_MENOR,isClickable()),
                Click.on(PRECIO_MENOR),
                WaitUntil.the(PRODUCTO,isClickable()),
                Click.on(PRODUCTO),
                WaitUntil.the(AGREGAR_PRODUCTO,isClickable()),
                Click.on(AGREGAR_PRODUCTO),
                WaitUntil.the(VER_COMPRAS,isClickable()),
                Click.on(VER_COMPRAS),
                WaitUntil.the(CONTINUAR_COMPRA,isClickable()),
                Click.on(CONTINUAR_COMPRA),
                WaitUntil.the(IR_PAGAR,isClickable()),

                Click.on(IR_PAGAR),
                WaitUntil.the(PAGO_EFECTY,isClickable()),

                Click.on(PAGO_EFECTY)
        );
    }

    public static SeleccionaProducto seleccionaProducto() {
        return new SeleccionaProducto();
    }
}



