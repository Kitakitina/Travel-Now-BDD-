package com.travelnow.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("que el usuario está en la página de inicio de sesión")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        System.out.println("El usuario está en la página de inicio de sesión.");
    }

    @When("ingresa credenciales válidas")
    public void ingresa_credenciales_validas() {
        System.out.println("El usuario ingresa credenciales válidas.");
    }

    @Then("el sistema lo manda a la página principal")
    public void el_sistema_lo_manda_a_la_pagina_principal() {
        System.out.println("El sistema redirige al usuario a la página principal.");
    }

    @When("ingresa credenciales incorrectas")
    public void ingresa_credenciales_incorrectas() {
        System.out.println("El usuario ingresa credenciales incorrectas.");
    }

    @Then("el sistema muestra un mensaje de {string}")
    public void el_sistema_muestra_un_mensaje(String mensaje) {
        System.out.println("El sistema muestra el mensaje: " + mensaje);
    }
}
