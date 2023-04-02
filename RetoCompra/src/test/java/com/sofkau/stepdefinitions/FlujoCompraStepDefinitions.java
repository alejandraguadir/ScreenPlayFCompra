package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.MetododePago.metododePago;
import static com.sofkau.tasks.NavegarAlInicioSesion.navegarAlInicioSesion;
import static com.sofkau.tasks.SeleccionaProducto.seleccionaProducto;
import static com.sofkau.util.SetVariables.getUserPasword;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class FlujoCompraStepDefinitions extends Configuracion {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FlujoCompraStepDefinitions.class));
    private List<String> credenciales = getUserPasword();

    public FlujoCompraStepDefinitions() throws IOException {
    }

    @Given("el usuario esta en la pagina principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {

        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
            LOGGER.info("Incio de automatización flujo de compra falabella");

        } catch (Exception e) {
            LOGGER.info(" Fallo la configuracion inicial");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }

    @When("navega hasta la opcion de incio de sesion")
    public void navegaHastaLaOpcionDeIncioDeSesion() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAlInicioSesion()
                            .conElUsuario(credenciales.get(0))
                            .yConLaContrasenna(credenciales.get(1))
            );

            LOGGER.info("Incio de sesión correcto");

        } catch (Exception e) {
            LOGGER.info(" fallo al iniciar sesión");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }


    }

    @When("selecciona el producto")
    public void seleccionaElProducto() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    buscarProducto()
                            .yProducto("reloj")
            );

            LOGGER.info("Busqueda exitosa");
            theActorInTheSpotlight().attemptsTo(
                    seleccionaProducto()
            );

            LOGGER.info("Selección de producto con exito");
            theActorInTheSpotlight().attemptsTo(
                    metododePago()
            );

            LOGGER.info("Medio de pago seleccionado con exito");



        } catch (Exception e) {
            LOGGER.info(" Fallo al seleccionar el producto");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }

    @Then("debe observar un mensaje de compra exitosa")
    public void debeObservarUnMensajeDeCompraExitosa() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeCompra(), equalTo("Para finalizar la compra, dir\u00EDgete a una sucursal Efecty con el c\u00F3digo de pago que recibir\u00E1s en el siguiente paso y realiza el pago para evitar el retraso o la cancelaci\u00F3n de tu orden."))
            );

            LOGGER.info("Prueba realizada con exito ");

        } catch (Exception e) {
            LOGGER.info(" Fallo al realizar la assercion");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }


    }

}
