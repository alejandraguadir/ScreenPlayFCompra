package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaCompra.*;
import static com.sofkau.ui.PaginaInicioSesion.*;


public class SeleccionaProducto implements Task {
    private String producto;


    public SeleccionaProducto yProducto(String producto){
        this.producto = producto;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(BOTON_MICUENTA),
                //Enter.theValue(usuario).into(EMAIL),
                //Enter.theValue(contrasenna).into(PASS),
                //Click.on(BOTON_INGRESAR),
                Scroll.to(BOTON_CATEGORIAS),
                Enter.theValue(producto).into(BOTON_CATEGORIAS),
                Click.on(BUSCAR),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO_MENOR),
                Click.on(PRODUCTO),
                Click.on(AGREGAR_PRODUCTO),
                Click.on(VER_COMPRAS),
                Click.on(CONTINUAR_COMPRA),
                Click.on(IR_PAGAR),
                Click.on(PAGO_EFECTY)
        );
    }
        public static SeleccionaProducto seleccionaProducto (){
        return new SeleccionaProducto();
    }
}



