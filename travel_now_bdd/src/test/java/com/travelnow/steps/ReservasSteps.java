package com.travelnow.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservasSteps {

    @Given("que el usuario ha iniciado sesión correctamente")
    public void que_el_usuario_ha_iniciado_sesion_correctamente() {
        System.out.println("El usuario ha iniciado sesión correctamente.");
    }

    @And("tiene un vuelo seleccionado en la lista de resultados")
    public void tiene_un_vuelo_seleccionado_en_la_lista_de_resultados() {
        System.out.println("El usuario tiene un vuelo seleccionado.");
    }

    @And("tiene un hotel seleccionado en la lista de resultados")
    public void tiene_un_hotel_seleccionado_en_la_lista_de_resultados() {
        System.out.println("El usuario tiene un hotel seleccionado.");
    }

    @When("confirma la reserva y realiza el pago con tarjeta válida")
    public void confirma_la_reserva_y_realiza_el_pago_con_tarjeta_valida() {
        System.out.println("El usuario realiza el pago exitosamente.");
    }

    @Then("el sistema muestra un mensaje {string}")
    public void el_sistema_muestra_un_mensaje(String mensaje) {
        System.out.println("El sistema muestra el mensaje: " + mensaje);
    }
}
