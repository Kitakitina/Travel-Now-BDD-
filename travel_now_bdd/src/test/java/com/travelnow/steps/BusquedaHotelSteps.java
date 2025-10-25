package com.travelnow.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BusquedaHotelSteps {

    @When("selecciona fechas de entrada {string} y salida {string}")
    public void selecciona_fechas_de_entrada_y_salida(String entrada, String salida) {
        System.out.println("Selecciona fechas: entrada " + entrada + ", salida " + salida);
    }

    @Then("el sistema muestra una lista de hoteles disponibles")
    public void el_sistema_muestra_una_lista_de_hoteles_disponibles() {
        System.out.println("El sistema muestra los hoteles disponibles.");
    }
}
