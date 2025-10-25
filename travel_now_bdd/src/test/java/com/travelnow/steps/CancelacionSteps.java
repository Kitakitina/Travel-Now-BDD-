package com.travelnow.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelacionSteps {

    @Given("que el usuario tiene una reserva activa")
    public void que_el_usuario_tiene_una_reserva_activa() {
        System.out.println("El usuario tiene una reserva activa.");
    }

    @When("ingresa a {string}")
    public void ingresa_a(String seccion) {
        System.out.println("El usuario ingresa a la sección: " + seccion);
    }

    @And("selecciona {string}")
    public void selecciona(String opcion) {
        System.out.println("El usuario selecciona la opción: " + opcion);
    }

    @Then("la reserva cambia su estado a {string}")
    public void la_reserva_cambia_su_estado_a(String estado) {
        System.out.println("El sistema cambia el estado de la reserva a: " + estado);
    }
}
