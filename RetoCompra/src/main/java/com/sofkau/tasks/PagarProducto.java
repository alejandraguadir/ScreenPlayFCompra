package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class PagarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(VER_COMPRAS, isPresent()),
                WaitUntil.the(VER_COMPRAS, isCurrentlyVisible()),
                WaitUntil.the(VER_COMPRAS, isCurrentlyEnabled()),
                WaitUntil.the(VER_COMPRAS,isClickable()),
                Click.on(VER_COMPRAS),

                WaitUntil.the(CONTINUAR_COMPRA, isPresent()),
                WaitUntil.the(CONTINUAR_COMPRA, isCurrentlyVisible()),
                WaitUntil.the(CONTINUAR_COMPRA, isCurrentlyEnabled()),
                WaitUntil.the(CONTINUAR_COMPRA,isClickable()),
                Click.on(CONTINUAR_COMPRA),

                WaitUntil.the(IR_PAGAR, isPresent()),
                WaitUntil.the(IR_PAGAR, isCurrentlyVisible()),
                WaitUntil.the(IR_PAGAR, isCurrentlyEnabled()),
                WaitUntil.the(IR_PAGAR,isClickable()),
                Click.on(IR_PAGAR),

                WaitUntil.the(PAGO_EFECTY, isPresent()),
                WaitUntil.the(PAGO_EFECTY, isCurrentlyVisible()),
                WaitUntil.the(PAGO_EFECTY, isCurrentlyEnabled()),
                WaitUntil.the(PAGO_EFECTY,isClickable()),
                Scroll.to(PAGO_EFECTY),
                Click.on(PAGO_EFECTY)
        );
    }

    public static PagarProducto pagarProducto() {
        return new PagarProducto();
    }
}



