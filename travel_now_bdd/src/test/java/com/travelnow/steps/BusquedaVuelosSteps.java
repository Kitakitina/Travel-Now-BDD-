package com.travelnow.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusquedaVuelosSteps {

    @Given("que el usuario está en la sección de vuelos")
    public void que_el_usuario_esta_en_la_seccion_de_vuelos() {
        System.out.println("El usuario está en la sección de vuelos.");
    }

    @When("ingresa origen {string} y destino {string}")
    public void ingresa_origen_y_destino(String origen, String destino) {
        System.out.println("Buscando vuelos desde " + origen + " hacia " + destino + ".");
    }

    @And("presiona {string}")
    public void presiona(String boton) {
        System.out.println("El usuario presiona el botón: " + boton);
    }

      @Then("se muestran resultados entre {string} y {string}")
    public void se_muestran_resultados_entre_y(String origen, String destino) {
        System.out.println("El sistema muestra resultados de vuelos entre " + origen + " y " + destino + ".");
    }
}
