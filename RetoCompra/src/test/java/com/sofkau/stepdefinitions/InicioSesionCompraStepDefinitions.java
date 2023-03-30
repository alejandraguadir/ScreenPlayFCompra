package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.tasks.NavegarAlInicioSesion.navegarAlInicioSesion;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionCompraStepDefinitions extends Configuracion {

    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }

    @Cuando("navega hasta la el formulario de inicio de sesion")
    public void navegaHastaLaElFormularioDeInicioDeSesion() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesion()
                        .conElUsuario("ayolima05@gmail.com")
                        .yConLaContrasenna("Contrasenia2045")
        );
    }


    @Cuando("Completa los campos para el login y selecciona producto")
    public void completaLosCamposParaElLoginYSeleccionaProducto() {

    }

    @Entonces("el usuario debe mirar un mensaje de compra exitosa")
    public void elUsuarioDebeMirarUnMensajeDeCompraExitosa() {

    }

}
