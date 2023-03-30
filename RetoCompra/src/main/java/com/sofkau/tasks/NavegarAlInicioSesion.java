package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.sofkau.ui.PaginaCompra.*;
import static com.sofkau.ui.PaginaInicioSesion.*;


public class NavegarAlInicioSesion implements Task {
    private String usuario;
    private String contrasenna;
    private String producto;

    public NavegarAlInicioSesion conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public NavegarAlInicioSesion yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    public NavegarAlInicioSesion yProducto(String producto){
        this.producto = producto;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MICUENTA),
                Enter.theValue(usuario).into(EMAIL),
                Enter.theValue(contrasenna).into(PASS),
                Click.on(BOTON_INGRESAR)

        );
    }
        public static NavegarAlInicioSesion navegarAlInicioSesion (){
        return new NavegarAlInicioSesion ();
    }
}



