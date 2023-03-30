package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaInicioSesion.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasenna;

    public IniciarSesion conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(BOTON_MICUENTA)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
