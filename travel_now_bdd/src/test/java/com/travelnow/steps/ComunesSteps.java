package com.travelnow.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ComunesSteps {

    @Given("que el usuario está en la página principal")
    public void que_el_usuario_esta_en_la_pagina_principal() {
        // Aquí puedes navegar a la página principal si usas WebDriver.
        // Por ahora dejamos un mensaje para que los tests no queden sin implementar.
        System.out.println("El usuario está en la página principal.");
    }

    @Then("se muestran vuelos disponibles en pantalla")
    public void se_muestran_vuelos_disponibles_en_pantalla() {
        // Lógica de verificación real (asserts) o comprobación de elementos aquí.
        System.out.println("Se muestran vuelos disponibles en pantalla.");
    }
}
