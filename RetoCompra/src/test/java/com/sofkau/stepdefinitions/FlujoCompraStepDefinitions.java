package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.io.IOException;
import java.util.List;

import static com.sofkau.tasks.NavegarAlInicioSesion.navegarAlInicioSesion;
import static com.sofkau.tasks.SeleccionaProducto.seleccionaProducto;
import static com.sofkau.util.SetVariables.getUserPasword;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoCompraStepDefinitions extends Configuracion {

    private List<String> credenciales = getUserPasword();

    public FlujoCompraStepDefinitions() throws IOException {
    }


    @Given("el usuario esta en la pagina principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }

    @When("navega hasta la opcion de incio de sesion")
    public void navegaHastaLaOpcionDeIncioDeSesion() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesion()
                        .conElUsuario(credenciales.get(0))
                        .yConLaContrasenna(credenciales.get(1))

        );
    }

    @When("selecciona el producto")
    public void seleccionaElProducto() {
        theActorInTheSpotlight().attemptsTo(
                seleccionaProducto()
                        .yProducto("cuchara")
        );
    }

    @Then("debe observar un mensaje de compra exitosa")
    public void debeObservarUnMensajeDeCompraExitosa() {

    }

}
